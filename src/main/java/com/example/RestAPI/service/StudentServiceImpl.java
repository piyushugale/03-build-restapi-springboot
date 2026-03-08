// controller > dto > service > entity > repository
// Interface is created for loose coupling

package com.example.RestAPI.service;
import com.example.RestAPI.dto.StudentDto;
import com.example.RestAPI.entity.StudentEntity;
import com.example.RestAPI.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<StudentEntity> studentEntities = studentRepository.findAll();                                               // Get list of students from the database (entity)
        return studentEntities.stream()                                                                            // Convert list > stream to process each student one by one
                .map(studentEntity -> new StudentDto(studentEntity.getId(), studentEntity.getName(), studentEntity.getEmail()))     // Map stream > DTO object
                .toList();                                                                                  // Convert stream > list and return to Controller
    }

    @Override
    public StudentDto getStudentById(Long id) {
        // 1. Find the single entity
        StudentEntity studentEntity = studentRepository.findById(id)                                                    // Find the student by id from the database (entity)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));               // If student is not found, throw an exception
        return modelMapper.map(studentEntity, StudentDto.class);                                                  // Convert the entity to DTO using MapperConfig
    }

}

// controller > dto > service > entity > repository
// Interface is created for loose coupling

package com.example.RestAPI.service;
import com.example.RestAPI.dto.StudentDto;
import com.example.RestAPI.entity.Student;
import com.example.RestAPI.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> students = studentRepository.findAll();                                               // Get list of students from the database (entity)
        return students.stream()                                                                            // Convert list > stream to process each student one by one
                .map(student -> new StudentDto(student.getId(), student.getName(), student.getEmail()))     // Map stream > DTO object
                .toList();                                                                                  // Convert stream > list and return to Controller
    }

    @Override
    public StudentDto getStudentById(Long id) {
        // 1. Find the single entity
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));

        // 2. Map that single entity to a single DTO
        return new StudentDto(student.getId(), student.getName(), student.getEmail());
    }

}

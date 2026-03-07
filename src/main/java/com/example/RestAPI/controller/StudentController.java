// controller > dto > service > entity > repository
package com.example.RestAPI.controller;
import com.example.RestAPI.dto.StudentDto;
import com.example.RestAPI.entity.Student;
import com.example.RestAPI.repository.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Student> getStudent(){
        return studentRepository.findAll();

    }



}

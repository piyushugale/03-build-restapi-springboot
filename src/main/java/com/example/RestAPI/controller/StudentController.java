package com.example.RestAPI.controller;

import com.example.RestAPI.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public StudentDto getStudent(){
        return new StudentDto(7L, "Mark", "mark@gmail.com");
//        return "Welcome to REST API";

    }



}

package com.example.RestAPI.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                                                   // spring creates getters and setters in backend
@AllArgsConstructor                                     // constructor with one parameter for every field in your class. do not create getter setters - did not work
@NoArgsConstructor                                      // Default constructor
public class StudentDto {
    private Long id;
    private String name;
    private String email;
}


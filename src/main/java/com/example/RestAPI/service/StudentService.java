// controller > dto > service > entity > repository
// Interface is created for loose coupling

package com.example.RestAPI.service;
import com.example.RestAPI.dto.StudentDto;
import java.util.List;

public interface StudentService {

    List<StudentDto> getAllStudents();
    StudentDto getStudentById(Long id);

}

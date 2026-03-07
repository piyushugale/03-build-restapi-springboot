// controller > dto > service > entity > repository
package com.example.RestAPI.repository;

import com.example.RestAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

// controller > dto > service > entity > repository
package com.example.RestAPI.repository;

import com.example.RestAPI.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}

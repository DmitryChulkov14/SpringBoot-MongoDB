package com.dc14.repository;

import com.dc14.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findStudentByName(String name);

    List<Student> findStudentByNameAndEmail(String name, String email);

    List<Student> findStudentByNameOrEmail(String name, String email);

    List<Student> findByEmailIsLike(String email);

    List<Student> findByNameStartsWith(String name);

    List<Student> findByDepartmentId(String departmentId);
}

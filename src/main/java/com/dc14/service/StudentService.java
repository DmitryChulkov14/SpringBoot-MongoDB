package com.dc14.service;

import com.dc14.entity.Student;
import com.dc14.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudentById(String id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(String id) {
        studentRepository.deleteById(id);
        return "Student has been deleted!";
    }

    public List<Student> getAllStudentsByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    public List<Student> studentsByNameAndMail(String name, String email) {
        return studentRepository.findStudentByNameAndEmail(name, email);
    }
}

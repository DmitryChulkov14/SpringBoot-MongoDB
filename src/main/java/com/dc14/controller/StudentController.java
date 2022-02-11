package com.dc14.controller;

import com.dc14.entity.Student;
import com.dc14.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<Student> getStudentsByName(@PathVariable String name) {
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/studentsByNameAndMail")
    public List<Student> getStudentsByNameAndMail(@RequestParam String name, @RequestParam String email) {
        return studentService.studentsByNameAndMail(name, email);
    }

    @GetMapping("/studentsByNameOrMail")
    public List<Student> getStudentsByNameOrMail(@RequestParam String name, @RequestParam String email) {
        return studentService.getStudentsByNameOrMail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pageNo, @RequestParam int pageSize) {
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSortingByName")
    public List<Student> getAllWithSortingByName() {
        return studentService.getAllWithSortingByName();
    }

    @GetMapping("/allByDepartmentName")
    public List<Student> getAllByDepartmentName(@RequestParam String departmentName) {
        return studentService.getAllByDepartmentName(departmentName);
    }

    @GetMapping("/allBySubjectName")
    public List<Student> getAllBySubjectName(@RequestParam String subjectName) {
        return studentService.getAllBySubjectName(subjectName);
    }

    @GetMapping("/allByEmailLike")
    public List<Student> getAllByEmailLike(@RequestParam String email) {
        return studentService.getAllByEmailLike(email);
    }

    @GetMapping("/allByNameStartsWith")
    public List<Student> getAllByNameStartsWith(@RequestParam String name) {
        return studentService.getAllByNameStartsWith(name);
    }
}

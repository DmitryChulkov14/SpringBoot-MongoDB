package com.dc14.controller;

import com.dc14.entity.Student;
import com.dc14.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
@AllArgsConstructor
@Log
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student student) {
        log.info("Creating the new student");
        return studentService.createStudent(student);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable String id) {
        log.info(String.format("Getting the student by id: %s", id));
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        log.info("Getting all students");
        return studentService.getAllStudents();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        log.info(String.format("Updating the student: %s", student.getId()));
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable String id) {
        log.info(String.format("Removing the student: %s", id));
        return studentService.deleteStudent(id);
    }

    @GetMapping("/studentsByName/{name}")
    public List<Student> getStudentsByName(@PathVariable String name) {
        log.info(String.format("Getting the student by name: %s", name));
        return studentService.getStudentsByName(name);
    }

    @GetMapping("/studentsByNameAndMail")
    public List<Student> getStudentsByNameAndMail(@RequestParam String name, @RequestParam String email) {
        log.info(String.format("Getting the student by name: %s AND email: %s", name, email));
        return studentService.studentsByNameAndMail(name, email);
    }

    @GetMapping("/studentsByNameOrMail")
    public List<Student> getStudentsByNameOrMail(@RequestParam String name, @RequestParam String email) {
        log.info(String.format("Getting the student by name: %s OR email: %s", name, email));
        return studentService.getStudentsByNameOrMail(name, email);
    }

    @GetMapping("/allWithPagination")
    public List<Student> getAllWithPagination(@RequestParam int pageNo, @RequestParam int pageSize) {
        log.info(String.format("Getting students on page: %d, pageSize: %d", pageNo, pageSize));
        return studentService.getAllWithPagination(pageNo, pageSize);
    }

    @GetMapping("/allWithSortingByName")
    public List<Student> getAllWithSortingByName() {
        log.info("Getting all students sorting by name");
        return studentService.getAllWithSortingByName();
    }

    @GetMapping("/allByEmailLike")
    public List<Student> getAllByEmailLike(@RequestParam String email) {
        log.info(String.format("Getting all students by email LIKE: %s", email));
        return studentService.getAllByEmailLike(email);
    }

    @GetMapping("/allByNameStartsWith")
    public List<Student> getAllByNameStartsWith(@RequestParam String name) {
        log.info(String.format("Getting all students by name STARTS WITH: %s", name));
        return studentService.getAllByNameStartsWith(name);
    }

    @GetMapping("/allByDepartmentId")
    public List<Student> getAllByDepartmentId(@RequestParam String departmentId) {
        log.info(String.format("Getting all students by department id: %s", departmentId));
        return studentService.getAllByDepartmentId(departmentId);
    }
}

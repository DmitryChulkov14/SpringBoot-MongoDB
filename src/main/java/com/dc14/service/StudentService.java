package com.dc14.service;

import com.dc14.entity.Department;
import com.dc14.entity.Student;
import com.dc14.entity.Subject;
import com.dc14.repository.DepartmentRepository;
import com.dc14.repository.StudentRepository;
import com.dc14.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
    private final SubjectRepository subjectRepository;

    public Student createStudent(Student student) {
        Department department = student.getDepartment();
        if (department != null) {
            departmentRepository.save(department);
        }
        List<Subject> subjects = student.getSubjects();
        if (subjects != null && !subjects.isEmpty()) {
            subjectRepository.saveAll(subjects);
        }
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

    public List<Student> getStudentsByName(String name) {
        return studentRepository.findStudentByName(name);
    }

    public List<Student> studentsByNameAndMail(String name, String email) {
        return studentRepository.findStudentByNameAndEmail(name, email);
    }

    public List<Student> getStudentsByNameOrMail(String name, String email) {
        return studentRepository.findStudentByNameOrEmail(name, email);
    }

    public List<Student> getAllWithPagination(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize); // "-1" could be handled on UI side

        return studentRepository.findAll(pageable).getContent();
    }

    public List<Student> getAllWithSortingByName() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");

        return studentRepository.findAll(sort);
    }

    public List<Student> getAllByDepartmentName(String departmentName) {
        return studentRepository.findByDepartmentName(departmentName);
    }

    public List<Student> getAllBySubjectName(String subjectName) {
        return studentRepository.findBySubjectsName(subjectName);
    }

    public List<Student> getAllByEmailLike(String email) {
        return studentRepository.findByEmailIsLike(email);
    }

    public List<Student> getAllByNameStartsWith(String name) {
        return studentRepository.findByNameStartsWith(name);
    }
}

package com.huunam.service;

import com.huunam.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);

    List<Student> getAllStudents();

    Student updateStudent(Student student,Long id);

    Student getStudent(Long id);

    void deleteStudent(Long id);
}

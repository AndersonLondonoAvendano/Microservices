package com.microservice.student.service;

import com.microservice.student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> finAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findAllByCourseId(Long id);

}

package com.example.manytomany.controller;

import com.example.manytomany.entity.Student;
import com.example.manytomany.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName :  com.example.manytomany.controller
 * fileName : EnrollmentController
 * author :  eomjin-ung
 * date : 2023/03/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2023/03/01           eomjin-ung          init
 */

@RestController
@RequiredArgsConstructor
public class EnrollmentController {

    private final StudentRepository studentRepository;

    @GetMapping("/student")
    public Student findStudent() {
        Student student = studentRepository.findById(1L).orElse(null);
        return student;
    }
}

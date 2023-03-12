package com.example.manytomany.entity;

import com.example.manytomany.repository.CourseRepository;
import com.example.manytomany.repository.EnrollmentRepository;
import com.example.manytomany.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName :  com.example.manytomany.entity
 * fileName : EnrollmentTest
 * author :  woongi9
 * date : 2023/03/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2023/03/01                               init
 */

@SpringBootTest
class EnrollmentTest {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    CourseRepository courseRepo;

    @Autowired
    EnrollmentRepository enrollmentRepo;

    @Test
    @Transactional
    void enrollment_test() {

        // given
        Student student1 = new Student("woong");
        Student student2 = new Student("ung");

        Course course1 = new Course("math");
        Course course2 = new Course("science");
        Course course3 = new Course("society");

        Enrollment enrollment1 = new Enrollment(student1, course1);
        Enrollment enrollment2 = new Enrollment(student1, course2);
        Enrollment enrollment3 = new Enrollment(student2, course2);
        Enrollment enrollment4 = new Enrollment(student2, course3);

        List<Enrollment> studentList1 = new ArrayList<>();
        studentList1.add(enrollment1);
        studentList1.add(enrollment2);
        List<Enrollment> studentList2 = new ArrayList<>();
        studentList2.add(enrollment3);
        studentList2.add(enrollment4);

        List<Enrollment> courseList1 = new ArrayList<>();
        courseList1.add(enrollment1);
        List<Enrollment> courseList2 = new ArrayList<>();
        courseList2.add(enrollment2);
        courseList2.add(enrollment3);
        List<Enrollment> courseList3 = new ArrayList<>();
        courseList3.add(enrollment4);

        student1.setEnrollments(studentList1);
        student2.setEnrollments(studentList2);

        course1.setEnrollments(courseList1);
        course2.setEnrollments(courseList2);
        course3.setEnrollments(courseList3);

        studentRepo.save(student1);
        studentRepo.save(student2);

        courseRepo.save(course1);
        courseRepo.save(course2);
        courseRepo.save(course3);

        enrollmentRepo.save(enrollment1);
        enrollmentRepo.save(enrollment2);
        enrollmentRepo.save(enrollment3);
        enrollmentRepo.save(enrollment4);

        // when
        Student student = studentRepo.findById(1L).orElse(null);

        System.out.println("student.getName() = " + student.getName());
    }
}
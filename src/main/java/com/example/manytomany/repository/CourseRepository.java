package com.example.manytomany.repository;

import com.example.manytomany.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName :  com.example.manytomany.repository
 * fileName : CourseRepository
 * author :  Woongi9
 * date : 2023/03/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2023/03/01                               init
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
}

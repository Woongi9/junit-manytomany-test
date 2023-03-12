package com.example.manytomany.repository;

import com.example.manytomany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName :  com.example.manytomany.repository
 * fileName : StudentRepository
 * author :  Woongi9
 * date : 2023/03/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2023/03/01           Woongi9             init
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}

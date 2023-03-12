package com.example.manytomany.repository;

import com.example.manytomany.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName :  com.example.manytomany.repository
 * fileName : EnrollmentRepository
 * author :  Woongi9
 * date : 2023/03/01
 * description :
 * ===========================================================
 * DATE                 AUTHOR              NOTE
 * -----------------------------------------------------------
 * 2023/03/01           Woongi9             init
 */
public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}

package com.rs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.entity.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

}

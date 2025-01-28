package com.rs.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.entity.Faculty;

public interface IFacultyRepo extends JpaRepository<Faculty, Integer> {

}

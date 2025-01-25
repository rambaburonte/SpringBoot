package com.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.entity.EmployeeEntity;

public interface IEmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}

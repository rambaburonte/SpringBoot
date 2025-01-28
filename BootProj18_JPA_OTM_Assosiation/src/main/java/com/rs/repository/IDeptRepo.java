package com.rs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rs.entity.Department;
@Repository
public interface IDeptRepo extends JpaRepository<Department,Integer> {

}

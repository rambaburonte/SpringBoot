package com.rs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rs.entity.Employee;
@Repository

public interface IEmpRepo extends JpaRepository<Employee,Integer>,CrudRepository<Employee,Integer> {
	@Query("SELECT d.did, d.name, d.loc, e.eid, e.name, e.sal FROM Employee e RIGHT JOIN e.deptno d")
	public List<Object[]> fetchDetailsFromTwoTables();

}

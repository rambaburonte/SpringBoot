package com.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rs.entity.Doctor;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	
	
	@Query(value=" select Timestampdiff(month,dob,curdate())/12 from doctor where id=:id", nativeQuery = true)
	public int findAgeById(Integer id);
}

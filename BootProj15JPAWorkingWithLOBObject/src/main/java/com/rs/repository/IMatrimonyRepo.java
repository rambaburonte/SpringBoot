package com.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rs.entity.Matrimony;

public interface IMatrimonyRepo extends JpaRepository<Matrimony, Integer> {
	
}

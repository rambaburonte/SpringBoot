package com.rs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.rs.entity.Farmer;

import jakarta.transaction.Transactional;

public interface IFarmerRepo extends CrudRepository<Farmer, Integer> ,JpaRepository<Farmer, Integer> {
	
	public List<Farmer> findByCrop(String cname);
	
	@Query("UPDATE Farmer f SET f.value = f.value + (f.value * :per / 100) WHERE f.crop = :cname")
	@Modifying
	@Transactional
	public int updateCropValue(@Param("cname") String cname,@Param("per") Integer per);
	
	
	@Query("Delete From Farmer Where crop=:crop")
	@Modifying
	@Transactional
	public int deleteByCrop(String crop);
	
	@Query(value="create table t2 (ename varchar(50),empno varchar(50),esal int)",nativeQuery = true)
	@Modifying
	@Transactional
	public int creat1table();

}

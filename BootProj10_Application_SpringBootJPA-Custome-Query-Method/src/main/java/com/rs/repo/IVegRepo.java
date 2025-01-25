package com.rs.repo;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rs.entity.VegEntity;

import jakarta.transaction.Transactional;

public interface IVegRepo extends JpaRepository<VegEntity,Integer> {
	
	
	@Query("FROM VegEntity")
	public List<VegEntity> findAllQ();
	@Query("FROM  VegEntity WHERE qty>= ?1")
	public List<VegEntity> findAllByQtyMorethan(Integer qty);
	@Query("FROM VegEntity WHERE price BETWEEN :p1 AND :p2")
	public List<VegEntity> findAllByPriceCatogity(Integer p1,Integer p2);
	@Query("SELECT name,price,qty FROM VegEntity WHERE qty>=:qty")
	public List<Object[]> findVegNamesPricesMoreTQrt(@Param("qty") Integer qty);
	@Query("SELECT name FROM VegEntity")
	public List<String> findAllVegNames();
	@Query("FROM VegEntity WHERE name=:name")
	public VegEntity findVegByName(String name);
	@Query("SELECT name,price,qty FROM VegEntity WHERE name=:name")
	public Object findVegPriceQty(String name);
	@Query("select count(distinct price) from VegEntity")
	public int countingUniqePrices();
	@Query("select count(*),sum(price),min(price),max(price),avg(price),sum(qty) from VegEntity")
	public Object calInVeg();
	
	
	
	@Query("UPDATE VegEntity SET price = price + (price * :price/100) WHERE name =:crop")
	@Modifying
	@Transactional
	public int updateCropValue(Integer price,String crop);
	

}

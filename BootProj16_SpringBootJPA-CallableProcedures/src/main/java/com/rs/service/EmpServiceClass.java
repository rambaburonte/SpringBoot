package com.rs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rs.entity.EmployeeEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;


/*
CREATE OR REPLACE PROCEDURE SALRANGEEMP 
(
  STARTSAL IN NUMBER 
, ENDSAL IN NUMBER 
, DETAILS OUT SYS_REFCURSOR

) AS 
BEGIN
   open details for
        select * from emp1442 where sal>=startsal and sal<=endsal;

END SALRANGEEMP;*/

@Service
public class EmpServiceClass {
	@Autowired
	private EntityManager em;
	
	public List<EmployeeEntity> retriveRecordBySalRange(Integer s,Integer e){
		
		StoredProcedureQuery query=em.createStoredProcedureQuery("SALRANGEEMP",EmployeeEntity.class);
		
		query.registerStoredProcedureParameter(1, Integer.class,ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Integer.class,ParameterMode.IN);
	//	query.registerStoredProcedureParameter(3,Object.class,ParameterMode.REF_CURSOR);
		
		query.setParameter(1, s);
		query.setParameter(2,e);
	
		List<EmployeeEntity> l=query.getResultList();
		return l;
		
		
		
		
	}
	
}

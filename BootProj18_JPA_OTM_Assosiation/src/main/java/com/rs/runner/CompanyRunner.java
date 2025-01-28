package com.rs.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.service.ComanayServiceMng;
import com.rs.service.ICompanyServiceMng;

@Component
public class CompanyRunner implements CommandLineRunner {
	@Autowired
	private ComanayServiceMng cs;

	@Override
	public void run(String... args) throws Exception {
		/*
		
		  try { System.out.println("start"); Employee e=new Employee();
		  e.setName("ram"); e.setSal(1254); Employee e1=new Employee();
		 e1.setName("anil"); e1.setSal(45816);
		 
		 Department d1=new Department(); d1.setDname("ACOUNTS"); d1.setLoc("hyd");
		 e1.setDeptno(d1);e.setDeptno(d1); Set<Employee> s=new HashSet<Employee>();
		 s.add(e);s.add(e1); d1.setE(s);
		 
		 
		 System.out.println(cs.insertRecordByDept(d1));
		 
		 
		}catch(Exception e) { e.printStackTrace(); }
		 */

		/*try{
			
			Department d= new Department();
			d.setDname("sales");
			d.setLoc("Kochi");
			Employee e1=new Employee();
			e1.setDeptno(d);
			e1.setName("Rajesj");
			e1.setSal(41587);
			Employee e2=new Employee();
			e2.setDeptno(d);
			e2.setName("mahesh");
			e2.setSal(85794);
			Set<Employee> s=new HashSet<>();
			s.add(e2);
			s.add(e1);
			System.out.println(cs.insertRecordByEmp(s));
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*
		  try {
		  
		  cs.retriveAllDept();
		  
		  
		  
		  }catch(Exception e){ e.printStackTrace(); }
		 
		*/

		/*try {
			List<Employee> l = cs.retriveAllEmpWithDept();
		
			l.forEach(i -> {
				System.out.println(i);
				Department d = i.getDeptno();
				System.out.println(d);
			});
		
		} catch (Exception e) {
			e.printStackTrace();
		
		}*/
		/*
		try {
		System.out.println(	cs.removeDeptAndEmps(7));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		*/
		
//		System.out.println(cs.removeAllEmpsAndDept(List.of(3,4,5)));
		
		/*	
			Employee e=new Employee();
			e.setName("narendra");
			e.setSal(14586);
		String e1=cs.addNewEmpToDept(e,6);
		System.out.println(e1);
			
			
			*/
		
		
	//	System.out.println(cs.removeAllEmpFromDept(7));
	//	System.out.println(cs.removeOneEmpInDept(8));
		
		
		cs.fetchDetailsFromTwoTables().forEach(row -> {
			for(Object r:row) {
				System.out.println(r);
				
			}
					
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

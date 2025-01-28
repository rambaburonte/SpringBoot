package com.rs.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.Faculty;
import com.rs.entity.Student;
import com.rs.service.IServiceInstutemng;
@Component
public class InstuteRunner implements CommandLineRunner {

	@Autowired
	private IServiceInstutemng is;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Faculty f=new Faculty();
		f.setName("raja");
		f.setCource("SBMS");
		
		Faculty f1=new Faculty();
		f1.setName("HK");
		f1.setCource("java");
		
		Student s1=new Student();
		s1.setSname("ramesh");
		s1.setSadd("hyd");
		//s1.setSid(1001);
		
		Student s=new Student();
		s.setSname("anil");
		s.setSadd("bpl");
		//s.setSid(1002);
		
		Student s2=new Student();
		s2.setSname("nagaraju");
		s2.setSadd("wrl");
	//	s2.setSid(1003);
		
	
		f1.setStudents(Set.of(s1,s,s2));
		f.setStudents(Set.of(s,s2));
		
//		s1.getFacInfo().add(f1);
//		s.getFacInfo().add(f);
//		s.getFacInfo().add(f1);
//		s2.getFacInfo().add(f);
//		s2.getFacInfo().add(f1);
		
		s.setFacInfo(Set.of(f,f1));
		s2.setFacInfo(Set.of(f,f1));
		s1.setFacInfo(Set.of(f));
		
		is.saveDataByParemt(f1);
		is.saveDataByParemt(f);
	}

}

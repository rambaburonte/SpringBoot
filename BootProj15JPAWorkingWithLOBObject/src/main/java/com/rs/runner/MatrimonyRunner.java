package com.rs.runner;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rs.entity.Matrimony;
import com.rs.service.MatrimonyServiceMng;
@Component
public class MatrimonyRunner implements CommandLineRunner{
	@Autowired
	private MatrimonyServiceMng ms;
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//file s inserting 
		/*Matrimony m=new Matrimony();
		
		FileInputStream is=new FileInputStream("C:\\Users\\ronte\\OneDrive\\Desktop\\RESUME UPDATED\\PASS PHOTO.jpg");
		byte[] br= new byte[is.available()];
		br=is.readAllBytes();
		
		File f=new File("C:\\Users\\ronte\\OneDrive\\Desktop\\example.txt");
		char[] cr=new char[(int) f.length()];
		Reader r=new FileReader(f);
		r.read(cr);
		
		m.setBioData(cr);m.setPic(br);m.setAddrs("hyd");m.setName("ram");m.setAge(21);
		
		ms.insertRecord(m);*/
		
		List<Matrimony> l=ms.retriveAllRecord();
		
		for(Matrimony m:l) {
			System.out.println( "user name " + m.getName() + "  age  " + m.getAge()  +
					" addrd  " + m.getAddrs() + " id " + m.getId()      );
			System.out.println("enter pic name ");
			String filename=sc.next();
			
			FileOutputStream fs= new  FileOutputStream(filename);
			fs.write(m.getPic());
			fs.flush(); fs.close();
			System.out.println("enter pic name ");
			String filename1=sc.next();
			FileWriter fs1=new FileWriter(filename1);
			fs1.write(m.getBioData());
			fs1.flush();
			fs1.close();
			
			
		}
		
		
		
	}}



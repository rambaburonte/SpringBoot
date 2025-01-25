package com.rs.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rs.model.EmployeeBean;
@Repository("sql")
@Profile({"uat","test"})
public class OracleEmployeeDAO implements IEmployeeDAO {
	@Autowired
	private DataSource ds;
	
	public static final String SELECTION_QUERY = "SELECT * FROM EMP11 where job IN (?,?,?)"  ; 
    public static final	String INSERT_QUERY="INSERT INTO EMP11 VALUES(?,?,?,?,?,?,?,?)";
    public static final String DELETE_QUERY="DELETE FROM EMP11 WHERE EMPNO=? ";
    public static final String UPDATE_QUERY="UPDATE EMP11 SET SAL=? WHERE EMPNO=? ";
	
	
	@Override
	public List<EmployeeBean> retriveEmp(String desg1, String desg2, String desg3) throws Exception {
		System.out.println(ds);
		ArrayList<EmployeeBean> list = new ArrayList<EmployeeBean>(); 
		try(Connection con=ds.getConnection()){
			PreparedStatement pstm=con.prepareStatement(SELECTION_QUERY);
			pstm.setString(1, desg1);
			pstm.setString(2, desg2);
			pstm.setString(3, desg3);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				
				EmployeeBean eb = new EmployeeBean();
				eb.setEmpno(rs.getString(1));
				eb.setEname(rs.getString(2));
				eb.setDesg(rs.getString(3));
				eb.setMgr(rs.getString(4));
				eb.setHiredate(rs.getString(5));
				eb.setSal(rs.getString(6));
				eb.setComm(rs.getString(7));
				eb.setDeptno(rs.getString(8));
				list.add(eb);
			}
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}	
		return list;
		
	}

	@Override
	public int insertEmp(EmployeeBean eb) throws Exception {
		System.out.println(ds);
		int rowCount=0;
		try (Connection con = ds.getConnection()){
				
			
			PreparedStatement pstm = con.prepareStatement(INSERT_QUERY);
			pstm.setString(1,eb.getEmpno());
			pstm.setString(2,eb.getEname());
			pstm.setString(3,eb.getDesg());
			pstm.setString(4,eb.getMgr());
			pstm.setString(5,eb.getHiredate());
			pstm.setString(6,eb.getSal());
			pstm.setString(7,eb.getComm());
			pstm.setString(8,eb.getDeptno());
			 rowCount = pstm.executeUpdate();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return rowCount;
	}
	@Override
	public int deleteEmp(String eid) throws Exception{
	
		int rc;
		try(Connection con=ds.getConnection()){
			 PreparedStatement pstm=con.prepareStatement(DELETE_QUERY);
			 pstm.setString(1, eid);
			 rc = pstm.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		
		
		return rc;
		
		
		
		
	}

	@Override
	public int updateEmpSal(String Eid, String Sal) throws Exception {
		int rc  ;
			try(Connection con=ds.getConnection()){
			PreparedStatement	pstm=con.prepareStatement(UPDATE_QUERY);
			pstm.setString(1, Sal);
			pstm.setString(2,Eid);
			rc = pstm.executeUpdate();
			
			}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}
		
		return rc;
	}

}
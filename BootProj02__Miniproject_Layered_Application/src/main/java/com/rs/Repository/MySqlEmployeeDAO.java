package com.rs.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rs.model.EmployeeBean;
@Repository("mysql")
public class MySqlEmployeeDAO implements IEmployeeDAO{
	@Autowired
	private DataSource ds;

	public static final String SELECTION_QUERY ="SELECT * FROM EMP11 where job IN (?,?,?)"  ; 
    public static final	String INSERT_QUERY="INSERT INTO EMP11 (ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUES (?, ?, ?, ?, ?, ?, ?)";
    public static final String DELETE_QUERY="DELETE FROM EMP11 WHERE EMPNO=? ";
    public static final String UPDATE_QUERY="UPDATE EMP11 SET SAL=? WHERE EMPNO=? ";
	@Override
	public List<EmployeeBean> retriveEmp(String desg1, String desg2, String desg3) throws Exception {
		
		
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
		int rc;
		try(Connection con=ds.getConnection()){
		PreparedStatement	pstm=con.prepareStatement(INSERT_QUERY);
		pstm.setString(1,eb.getEname());
		pstm.setString(2,eb.getDesg() );
		pstm.setString(3,eb.getMgr());
		pstm.setString(4, eb.getHiredate());
		pstm.setString(5,eb.getSal());
		pstm.setString(6, eb.getComm());
		pstm.setString(7,eb.getDeptno());
		rc  = pstm.executeUpdate();
		}catch(Exception e) {
			throw e;
		}
		return rc;
	}

	@Override
	public int deleteEmp(String eid) throws Exception {
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
		pstm.setString(1,Sal);
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
	










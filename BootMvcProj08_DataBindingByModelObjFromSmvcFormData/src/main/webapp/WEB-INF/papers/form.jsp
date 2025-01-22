<%@ taglib  uri="http://www.springframework.org/tags/form" prefix="frm"  %>
<!-- <form action="register" method="post"><table>
  <tr>
    <td>Student number</td>
    <td><input type="text" name="sno"></td>
  </tr>
   <tr>
    <td>Student name</td>
    <td><input type="text" name="sname"></td>
  </tr>
   <tr>
    <td>Student Address</td>
    <td><input type="text" name="add"></td>
  </tr>
   <tr>
    <td>Student marks</td>
    <td><input type="text" name="marks"></td>
  </tr>
  <tr >
  		<td colspan="2"> 
  		<input  type="submit" value="register">
  		 &nbsp; &nbsp; &nbsp; 
  		 <input type="reset" value="cancel">
  		</td>
  		
  </tr>
  
</table>
</form> -->


<frm:form action="register" modelAttribute="st">
<table>
	<tr>
	<td>Student number</td>
	<td>
	<frm:input path="sno"/>
	</td>
	</tr>
	<tr>
	<td>Student Name</td>
	<td><frm:input path="sname"  title="student name"/></td>
	</tr>
	<tr>
	<td>Student Add</td>	
	<td><frm:input path="add"/></td>
	</tr>
	<tr>
	<td>Student Marks</td>	
	<td><frm:input path="marks"/></td>
	</tr>
	<tr>
		<td><input type="submit" value="register"></td>
		<td><input type="reset" value="cancel"></td>
		
	</tr>
</table>
</frm:form>

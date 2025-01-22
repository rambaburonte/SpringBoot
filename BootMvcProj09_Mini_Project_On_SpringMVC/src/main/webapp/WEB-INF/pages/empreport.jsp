<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c"%>
<h1 style= "color:purple; text-align: center;">All Employees list</h1>
<br/><br/><br/><br/>
<a href="./" style="text-align: left;"><img src="images/home.png" width="30px" height="30px"></a>
<div  style="justify-content: center;  align-items: center; margin: auto; height: 100vh;  display: flex;" >

<c:choose>
<c:when test="${!empty eList}">
	<table border = "1px" style="background-color: teal; ">
	<tr> 
		<th> Emp id  </th><th> Emp name  </th><th> Emp sal  </th><th> Emp email  </th><th >Operations</th>
	
	</tr>
	
	<c:forEach var="i" items="${eList}">
	<tr>
		<td>  ${i.id} </td><td>${i.name}</td>
		<td>  ${i.sal} </td><td>${i.mail} </td>
		<td><a href="edit?no=${i.id}"><img src="images/edit.png" width="30px" height="30px"></a> &nbsp;&nbsp;&nbsp;
		<a href="delete?no=${i.id }"><img src="images/delete.png" width="30px" height="30px"></a></td>
	</tr>
	
	
	</c:forEach>
	</table>
	<br/>
	<a href="add"><img src="images/add.png" width="40px" height="50px"></a>
</c:when>
<c:otherwise>Employees not found </c:otherwise>
</c:choose>
<h1 style="text-align: center;color: teal;">${msg}</h1>
<br>
<br >

</div>

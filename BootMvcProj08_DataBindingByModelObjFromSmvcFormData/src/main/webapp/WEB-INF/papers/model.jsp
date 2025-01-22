<%@ taglib   uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> --%>
<%-- <h1>Your Model Object is :== ${mdl}</h1>
 --%>
 
 <h1>
 
 
 	
<%--  <c:if test="${! empty mdl}">
 
 	<c:out value="${mdl}"/>
 	
 	<c:forEach var="i" items="${mdl }">
 		<c:out value="${i}"/>
 	
 	</c:forEach>
 
 </c:if> --%>
 
 <c:choose>
 <c:when test="${!empty mdl }">
 <table border="2"" style="background-color: cyan">
 		<tr>
 		
 		<th>sno </th>
 		<th> sname </th>
 		<th> add </th>
 		<th> marks</th>
 		</tr>
 <c:forEach var="i" items="${mdl}">
 	
 
 	<tr>
 		<td> ${i.sno}</td><td>${i.sname }</td><td>${i.add }</td><td>${i.marks}</td>
 	<tr/>

 </c:forEach>
 
 	
 	</table>
 
 
 
 
 
 </c:when>
<c:otherwise>
	employees not found
</c:otherwise> 
</c:choose>
 </h1>
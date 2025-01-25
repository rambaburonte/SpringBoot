<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<h1 style="text-align: center;color: red">Employee edit page</h1>
<a href="./" style="text-align: left;"><img src="images/home.png" width="30px" height="30px"></a>
<f:form modelAttribute="e">
<table>
	<tr>
		Employee Id :<td><f:input path="id" readonly="true"/></td>
	
	</tr>
	<tr>
		
	<td>
			Employee name : <f:input path="name" />
	
	</td>
	</tr>
	<tr>
	<td>
		Employee sal:<f:input path="sal"/>
	</td>
	
	
	</tr>
	<tr>
	
	<td>
			Employee email: <f:input path="mail"/>
	
	</td>
	
	</tr>

<tr>
	<td>
		<input type="submit" value="update details"> &nbsp;&nbsp; <input type="reset" value="cancel">
		
	</td>

</tr>



</table>
</f:form>

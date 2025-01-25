<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"  %>
<a href="./" style="text-align: left;"><img src="images/home.png" width="30px" height="30px"></a>
<f:form modelAttribute="e" action="add" >

<table>

<tr><td> EMployee name</td>
<td><f:input path="name"/></td>
</tr>
<tr><td> Employee sal </td>
<td><f:input path="sal"/></td>
</tr>
<tr><td>Employee email</td>
<td	><f:input path="mail"/></td>
</tr>
<tr><td> <input type="submit" value="Register"> &nbsp;&nbsp; <input type="reset" value="calcel"> <td/></tr>
</table>
</f:form>


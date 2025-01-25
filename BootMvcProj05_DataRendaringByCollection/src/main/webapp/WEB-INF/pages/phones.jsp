<%-- <%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
All phone numbers  :== ${phones}

<c:if test="${!phones.isEmpty()}">

	<c:forEach var="i" items="${phones}">
		<c:out value="${i}"></c:out>
	</c:forEach>



</c:if> --%>


<%@ page isELIgnored="false" import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
#phones-list {
    background-color: #70CBBF;
    border: 2px solid black;
    width: 300px;
    margin: auto;
    padding: 20px;
    text-align: center;
    color: black;
}

.phone {
    border-bottom: 1px solid maroon;
    padding: 10px 0;
}

h2 {
    color: navy;
}
</style>

<div id="phones-list">
    <h2>Phone Numbers</h2>
    <%-- Displaying Phone Numbers --%>
    <c:if test="${!phones.isEmpty()}">
        <c:forEach var="i" items="${phones}">
            <div class="phone">
                <c:out value="${i}"/>
            </div>
        </c:forEach>
    </c:if>
</div>

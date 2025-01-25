<%-- <%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>
Friends Names :== ${friends}


<c:if test="${!friends.isEmpty()}">
<c:forEach var="i" items="${friends}">

<c:out value="${i}"/>

</c:forEach>


</c:if>





</div> --%>

<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<style>
#friends-list {
    background-color: #70CBBF;
    border: 2px solid black;
    width: 300px;
    margin: auto;
    padding: 20px;
    text-align: center;
    color: black;
}

.friend {
    border-bottom: 1px solid maroon;
    padding: 10px 0;
}

h2 {
    color: navy;
}
</style>

<div id="friends-list">
    <h2>Friends List</h2>
    <%-- Displaying Friends Names --%>
    <c:if test="${!friends.isEmpty()}">
        <c:forEach var="i" items="${friends}">
            <div class="friend">
                <c:out value="${i}"/>
            </div>
        </c:forEach>
    </c:if>
</div>

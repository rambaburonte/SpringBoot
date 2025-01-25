<%-- <%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

All Id details :== ${ids}




<c:if test="${!ids.isEmpty()}">
	<c:forEach var="i" items="${ids}">
		<c:out value="${i}"></c:out>
	</c:forEach>

</c:if> --%>

<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    // Simulating a list of IDs and adding it to the request
    List<Integer> ids = Arrays.asList(101, 102, 103, 104);
    request.setAttribute("ids", ids);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ID Details</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            color: #333;
            margin: 0;
            padding: 20px;
        }
        .container {
            max-width: 600px;
            margin: 20px auto;
            background: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            padding: 20px;
        }
        h1 {
            text-align: center;
            color: #4CAF50;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        ul li {
            background: #f4f4f4;
            margin: 8px 0;
            padding: 10px;
            border-radius: 4px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .no-ids {
            text-align: center;
            color: #888;
            font-style: italic;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>ID Details</h1>

        <%-- Debugging Output for IDs --%>
        <%-- All ID details: <%= ids %> --%>

        <c:if test="${not empty ids}">
            <ul>
                <c:forEach var="i" items="${ids}">
                    <li><c:out value="${i}" /></li>
                </c:forEach>
            </ul>
        </c:if>
        <c:if test="${empty ids}">
            <p class="no-ids">No IDs available.</p>
        </c:if>
    </div>
</body>
</html>

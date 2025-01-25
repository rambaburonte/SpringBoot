




<%-- <%@ page isELIgnored="false" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div>
	Fav Colors is :=<%= Arrays.toString((String[])request.getAttribute("colors"))%>
	

	<c:if test="${colors != null }">
    <c:forEach var="i" items="${colors}">
        <c:out value="${i}" />
    </c:forEach>
</c:if>
	


</div> --%>


<%@ page isELIgnored="false" import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
    // Simulate setting the "colors" attribute in the request
    String[] colors = {"Red", "Green", "Blue", "Yellow"};
    request.setAttribute("colors", colors);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Favorite Colors</title>
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
            margin: 0 auto;
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
        .no-colors {
            text-align: center;
            color: #888;
            font-style: italic;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Favorite Colors</h1>
        <%-- Debugging line to see colors in JSP, optional --%>
        <%-- Fav Colors are: <%= Arrays.toString((String[]) request.getAttribute("colors")) %> --%>

        <c:if test="${colors != null && not empty colors}">
            <ul>
                <c:forEach var="i" items="${colors}">
                    <li><c:out value="${i}" /></li>
                </c:forEach>
            </ul>
        </c:if>
        <c:if test="${colors == null || empty colors}">
            <p class="no-colors">No colors available.</p>
        </c:if>
    </div>
</body>
</html>

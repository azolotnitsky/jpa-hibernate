<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <%-- TEST DYNAMIC HEADER --%>
    <jsp:include page="header.jsp"/>
    <title>Orders Page</title>
</head>
<body>
<h2>Orders</h2>

<c:if test="${!empty orders}">
  <table class="data" border="1">
    <tr>
      <th>Address</th>
      <th>Status</th>
    </tr>
    <c:forEach items="${orders}" var="order">
      <tr>
        <td><c:choose><c:when test="${order.status = 0}">NEW</c:when>
	<c:when test="${order.status = 1}">IN PROGRESS</c:when>
	<c:when test="${order.status = 2}">COMPLETED</c:when>
	<c:otherwise>UNKNOWN</c:otherwise></c:choose></td>
      </tr>
    </c:forEach>
  </table>
</c:if>

</body>

<%-- TEST DYNAMIC FOOTER --%>
<jsp:include page="footer.jsp"/>
</html>

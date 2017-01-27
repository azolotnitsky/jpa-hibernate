<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <%-- TEST DYNAMIC HEADER --%>
    <jsp:include page="header.jsp"/>
    <title>Drivers Page</title>
</head>
<body>
<h2>Drivers</h2>

<c:if test="${!empty drivers}">
  <table class="data" border="1">
    <tr>
      <th>FIO</th>
    </tr>
    <c:forEach items="${drivers}" var="driver">
      <tr>
       	<td><a href="<spring:url value="/orders/${driver.id}.html"/>">${driver.fio}</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>

</body>

<%-- TEST DYNAMIC FOOTER --%>
<jsp:include page="footer.jsp"/>
</html>

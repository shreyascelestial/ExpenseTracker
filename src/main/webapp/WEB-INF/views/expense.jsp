<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
     <c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>ADD EXPENSE</h1>
    
     <form:form action="${contextRoot}/expense"  method="post" modelAttribute="expense" >
     
     <form:hidden path="id" />
     <form:input path="name" placeholder="Enter expense name" />
      <form:input path="amount" placeholder="Enter expense amount" />
      <form:input path="note" placeholder="Enter note (optional)" />
           
     <button type="submit">Add Expense</button>
     </form:form>
     
     <a href="${contextRoot}/expense/${expense.id}/delete">Delete</a>
  
</body>
</html>
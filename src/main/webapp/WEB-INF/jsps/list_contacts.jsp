<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
           <h2>view All leads</h2>
         <table border="1">
                 <tr>
                       <th>FirstName</th>
                       <th>LastName</th>
                       <th>Email</th>
                       <th>Mobile</th>
                       <th>Source</th>
                      
                 </tr>
                <c:forEach var="contact"  items="${contacts}">
                <tr>
                      <td>${contact.firstname}</td>   
                      <td>${contact.lastname}</td>
                      <td>${contact.email}</td>
                      <td>${contact.mobile}</td>
                      <td>${contact.source}</td>
                      
                </tr>
                
                </c:forEach> 
                 
         </table>
           
</body>
</html>
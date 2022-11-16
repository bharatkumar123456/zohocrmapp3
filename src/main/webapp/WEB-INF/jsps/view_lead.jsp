<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2>View Leads</h2>
       <pre>
		        First Name : ${lead.firstname}<br/>
		         Last Name : ${lead.lastname}<br/>
		             Email : ${lead.email}<br/>
		            Mobile : ${lead.mobile}<br/>
		            Source : ${lead.source}<br/>
		            
       </pre>
		       <form action="sendMail" method="post" >
		             <input type="hidden" name="email" value="${lead.email}" />
		                 <input type="submit" value="sendEmail"/>
		       </form>
       
		       <form action="convertLead" method="post">
		           <input type="hidden" name="id" value="${lead.id}" />
		                 <input type="submit" value="convert"/>
		       </form>
       
        
</body>
</html>
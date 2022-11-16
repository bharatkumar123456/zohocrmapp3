<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
         <h2>Create Leads</h2>
       <form action="savelead" method="post">
               <pre>
                      First Name<input type="text" name="firstname" />
                       Last Name<input type="text" name="lastname" />
                           Email<input type="text" name="email" />
                          Mobile<input type="text" name="mobile" />
                          
							    <select name="source" >
								  <option value="website">Website</option>
								  <option value="newspaper">News Paper</option>
								  <option value="tvadd">Tv-add</option>
								  <option value="radio">Radio</option>
								</select>
								
							<input type="submit" value="save" />	
                      
               </pre> 
                
       
       </form>

</body>
</html>
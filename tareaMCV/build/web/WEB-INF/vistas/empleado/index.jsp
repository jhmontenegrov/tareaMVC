<%-- 
    Document   : index
    Created on : 13/09/2013, 08:10:16 AM
    Author     : 202
--%>

<%@page import="modelos.MEmpleado"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        
        <%   MEmpleado empleado= (MEmpleado)request.getAttribute("w"); %>
   
        <%=empleado %>
  
    
    
    </body>
</html>

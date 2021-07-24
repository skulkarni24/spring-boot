<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add Book</title>
    </head>
    <body>
      
      
        <form:form action="/getUserDetails" method="GET" >
           <b>this is my proj.....yes</b>
            <input type="submit" value="View user"/>
        </form:form>
        
         <form:form action="/showBookDetails" method="GET" >
           <b>clik here to goto book.jsp page</b>
            <input type="submit" value="View Book Detials"/>
        </form:form>
        
        <form:form action="/showBooks" method="GET" >
           <b>clik here to see string</b>
            <input type="submit" value="Show Books"/>
        </form:form>
        
        
    </body>
</html>
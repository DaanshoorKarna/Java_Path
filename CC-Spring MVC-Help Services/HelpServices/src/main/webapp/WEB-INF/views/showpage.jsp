<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Online Help Services </center></h1>
<form:form method="post" modelAttribute="helper" action="helpDesk">
<center>
<table>
<tr>
<td><form:label path="serviceType">Choose Service:</form:label></td>
<td><form:select id ="serviceType" path="serviceType" items="${serviceList}" /></td>
</tr>
<tr>
<td><form:label path="noOfHours">Total Hours Service Required</form:label></td>
<td><form:input path="noOfHours" type="text" id="noOfHours"/></td>
</tr>
<tr>
<td><button type="submit" name="submit">Total Cost</button></td>
<td><button type="reset" name="cancel">Cancel</button></td>
</tr>


</table>
</center>

              
	
</form:form>


</body>
</html>	 	  	    	    	     	      	 	

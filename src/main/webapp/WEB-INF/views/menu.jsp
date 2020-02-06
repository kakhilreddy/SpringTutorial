

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<ul>
<c:choose>
	<c:when test="${!requestScope['javax.servlet.forward.request_uri'].equals('/one/') && !requestScope['javax.servlet.forward.request_uri'].equals('/one/about') }">
	 <li><a href="/one">Home</a> </li>
   <li><a href="/one/about">About</a> </li>
   </c:when>
   <c:when test="${ !requestScope['javax.servlet.forward.request_uri'].equals('/one/')}"><li> <a href="/one">Home</a> </li></c:when>
   <c:when test="${ !requestScope['javax.servlet.forward.request_uri'].equals('/one/about')}"><li> <a href="about">About</a> </li></c:when>  

   
</c:choose>
</ul>




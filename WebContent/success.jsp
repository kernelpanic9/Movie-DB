<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ include file="menu.jsp" %>
	
		<s:property value="sessionMap.user.firstName" /> <br/>
		
		<% %>
		<img src="<%= "img/"+(String)((User)(request.getSession().getAttribute("user"))).getUserName()+".jpg" %>" width="60" height="60" /> <br/>
		
		<s:property value="user.src" /> <br/>
		<%= "img/"+(String)((User)(request.getSession().getAttribute("user"))).getUserName()+".jpg" %>
		<s:property value="sessionMap.user.firstName"/> <br/>
		<s:property value="sessionMap.user.lastName"/> <br/>
	</body>

</html>



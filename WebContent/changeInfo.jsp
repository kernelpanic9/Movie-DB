<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="com.common.*" %>


<%@ include file="menu.jsp" %>

	
		
		<% User thisUser = (User)(request.getSession().getAttribute("user")); %>
			
		<div align="center" class="container" style="width:500px;">
			<h3>My Info</h3> <br/>
			<h5>Username: <%=thisUser.getUserName() %>"</h5>
			<br/>
			<img src="<%= "img/"+(String)((User)(request.getSession().getAttribute("user"))).getUserName()+".jpg" %>" width="93" height="108" class="img-rounded"	/>
			<br/>
			<br/>
			<s:form action="updateInfo" method="post" class="form-horizontal" align="center" enctype="multipart/form-data">
				
				<!-- 
				<%=thisUser.getPassword() %>
				<%=thisUser.getFirstName() %>
				<%=thisUser.getLastName() %>
				<%=thisUser.getCategoryId() %>
				<%=thisUser.getProfilePic() %>
				 -->
				<s:password name="user.password" value="" label="Password:" max-length="40" class="form-control"/>
				<s:textfield name="user.firstName" value="" label="First name:" max-length="40" class="form-control"></s:textfield>
				<s:textfield name="user.lastName" value="" label="Last name:" max-length="40" class="form-control"></s:textfield>
				<s:textfield name="user.categoryId" value="" label="Category Id:" max-length="40" class="form-control" />
				
				
				<s:file name="user.profilePic" value="" label="Profile Picture:"/>
				
				
				<s:submit value="Update Info" />
						
			</s:form>
		
		</div>





	</body>

</html>
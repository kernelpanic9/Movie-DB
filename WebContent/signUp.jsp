<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" >
		<!-- Optional theme -->
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
		<!-- Latest compiled and minified JavaScript -->
		<script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>


		<title>Hi, welcome...!</title>
		
		<!--
		<style>
			.form-control{
				width:400px;
			}
		</style>
		-->
		
	</head>
	
	<body>
		
		<nav class="navbar navbar-inverse">
		  <div class="container-fluid">
		    <div class="navbar-header">
		      <a class="navbar-brand" href="#">Movie DB</a>
		    </div>
		    <ul class="nav navbar-nav navbar-right">
		      <li><a href="signUp.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
		    </ul>
		  </div>
		</nav>
		
		
		<div align="center" class="container" style="width:500px;">
			<h3>Register in MovieDB</h3> <br/>
			<br/>
			<s:form action="signUp" method="post" class="form-horizontal" align="center" enctype="multipart/form-data">
				
				<s:textfield name="user.userName" label="User name:" max-length="40" class="form-control"></s:textfield>
				<s:password name="user.password" label="Password:" max-length="40" class="form-control"/>
				
				<s:textfield name="user.firstName" label="First name:" max-length="40" class="form-control"></s:textfield>
				<s:textfield name="user.lastName" label="Last name:" max-length="40" class="form-control"></s:textfield>
				
				<s:textfield name="user.categoryId" label="Category Id:" max-length="40" class="form-control" />
				
				
				<s:file name="user.profilePic" label="Profile Picture:"/>
				
								
				<s:submit value="SignUp" />
						
			</s:form>
		
		</div>
		
		
		
		
	</body>
	
</html>		
		

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
	
		
		<div align="center" class="panel container" style="width:400px;">
			<h3>Movie DB</h3> <br/>
			<img align="center" src="img/logo.jpg"  height="259" width="388" class="img-rounded"/> <br/>
			<br/>
			
			
			<s:form action="login" method="post" class="form-horizontal" align="center">
				
					<s:textfield name="user.userName" label="Username" maxlength="40" class="form-control" />
					<s:password name="user.password" label="Password" maxlength="40" class="form-control"/>
					<br/>
					<s:submit align="center" class="btn btn-default" value="Login"/>
				
			</s:form>
			
		</div>

	</body>

</html>


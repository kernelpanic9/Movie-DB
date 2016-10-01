<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" import="com.common.*" %>

<html>
	<head>
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap.min.css" >
		<!-- Optional theme -->
		<link rel="stylesheet" href="bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
		<!-- Latest compiled and minified JavaScript -->
		<script src="bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>

		<title>Hi, welcome...!</title>
	</head>
	
	
	<body>
	


 <nav class="navbar{min-height:25px;} navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="success.jsp">Movie DB</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="success.jsp">Home</a></li>
        <% if( ((User)request.getSession().getAttribute("user")).getCategoryId() == 1 ){ %>
        <li><a href="#">Admin</a>
        	<ol>
        		<li> <a href='addMovie.jsp'>Add Movie</a>
        	</ol>
        </li>
        <%} %>
        <li><a href="changeInfo.jsp">Change Info</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
		<li><a href="logout.action"><span class="glyphicon glyphicon-user"></span>Logout</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- 
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Movie DB</a>
		</div>
		<ul class="nav navbar-nav navbar-right">
			<li><a href="logout.action"><span class="glyphicon glyphicon-user"></span>Logout</a></li>
		</ul>
	</div>
</nav>
 -->

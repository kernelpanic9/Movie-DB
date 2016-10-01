<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<%@ include file="menu.jsp" %>


	<div align="center" class="container" style="width: 500px;">

		<h3>Add new movie</h3>
		<br/>
		<s:form action="addMovie" method="post" class="form-horizontal" align="center">
			<s:textfield name="movie.name" label="Movie name:" class="form-horizontal"/>
			<s:textfield name="movie.plot" label="Plot:" class="form-horizontal" />
			<s:textfield name="movie.year" label="Year:" class="form-horizontal" />
			<s:textfield name="movie.genere" label="Genere" class="form-horizontal" />
			<br/>
			<s:submit value="Add Movie" />
		</s:form>
	
	</div>
	
</body>


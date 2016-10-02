<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<title>My Page</title>
</head>
<body>
	<div align="center">
		<h1>My Page</h1>
		<hr width="100%" size="3" noshade />
 	</div>
	<form method="POST" action="${myurl}">
		<div align="center">
			<br>
			Forward data : <br> 
			<!-- <input type="text" size="30" name ="test" value="ForwardData"> -->
			
			 <textarea wrap="virtual" name="test" rows=15 cols=70 maxlength=1500
				value="ForwardData"> </textarea>
			<br>
			 <br><br>
			<input type="submit" value="checkout"><br>
		</div>
	</form>
</body>
</html>

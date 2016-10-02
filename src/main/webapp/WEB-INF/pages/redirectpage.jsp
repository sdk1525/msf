<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<title>My Page</title>
</head>
<body>
	<div align="center">
		<h1>Welcome to Message Forwarder System</h1>
	 
		<br>
		<hr width="100%" size="3" noshade />
		<h1>Redirection will happen here</h1>
	</div>
	<form method="POST" action="${redirectUrl}">
		<div align="center">
			<table border="4" cellpadding="1" cellspacing="1" width="10%">
				<tr>
					<td>Data </td>
					<td>${redirectedMessage} </td>
				</tr>
			</table>
			<br> <br> 
			<input type="hidden" size="30" name="t1" value="${redirectedMessage}">
			<br> <input type="submit" value="Continue">  <INPUT Type="button" VALUE="Back" onClick="history.go(-1);return true;">  <br>
		</div>
	</form>
</body>
</html>


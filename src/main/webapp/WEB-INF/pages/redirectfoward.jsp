<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Redirection Page</title>
<meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8" />
<meta HTTP-EQUIV="Cache-Control" CONTENT="no cache" />
<meta HTTP-EQUIV="Pragma" CONTENT="no cache" />
<meta HTTP-EQUIV="Expires" CONTENT="0" />
</head>

<body>
	<div align="center">
		<h1>Successful redirection happened</h1>
			<hr width="100%" size="3" noshade />
		<br>
		<b>Thanks for providing the password</b>
		<h4>The data is redirected is ${message}</h4>
		<h4>Your message is forwarded to customer now</h4>
		<INPUT Type="button" VALUE="Back" onClick="history.go(-1);return true;">
	</div>
</body>
</html>

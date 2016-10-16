<%@ page pageEncoding="UTF-8" %>
	<html>
		<head>
			<title>UnionPay Payment Page Redirection</title>
			<meta HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=UTF-8"/>
			<meta HTTP-EQUIV="Cache-Control" CONTENT="no cache"/>
			<meta HTTP-EQUIV="Pragma" CONTENT="no cache"/>
			<meta HTTP-EQUIV="Expires" CONTENT="0"/>
		</head>
		<body OnLoad="OnLoadEvent()">  
	 
		<form name="downloadForm" action="${redirectUrl}" method="POST">
		<input type="hidden" name="test" value="${redirectMessage}" />
	     
	    			<noscript>
				<center>
		
					<h2>1JavaScript is currently disabled or is not supported by your browser.</h2>
					<h3>Please click on the Submit button to continue the processing of your secure transaction.</h3>
					<input type="submit" value="continue"/>
				</center>
			</noscript>
			<input type="submit" value="continue"/> 
		</form>
		 
	   
 		<script type="text/javascript">
 onLoadEvent = function() {
  alert('Hi Page Loaded');
 }; 
</script>
 		 
		</body>
	</html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" session="true" contentType="text/html;charset=ISO-8859-1" %> 


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 
ransitional//EN" "http://www.w3.org/
  TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<html >
  <head>
    <meta charset="UTF-8">
    <title>Checkout form</title>  
 
 
<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"  type="text/css" />
  </head>
  <body>
    <!-- heading starts here -->
<hgroup class="heading">
<h1 class="major">Checkout Form12 </h1>
</hgroup> 
<!-- end heading -->

<!-- main content --> 
<form class="checkout" method="POST" action="${myurl}">
    <div class="checkout-header">
      <h1 class="checkout-title">Checkout
        <span class="checkout-price">$10</span>
      </h1>
    </div>
    <p>
     <input type="text" class="checkout-input checkout-card" name="test" placeholder="Term URL" autofocus> 
    </p>
    <p>
    <%if (request.getAttribute("flag").equals("false")) { %>
      <input type="text" class="checkout-input checkout-card" placeholder="Merchant Data">
      <% } %>
    </p>	
	<p>
      <input type="text" class="checkout-pareq" placeholder="Pareq">
    </p>
    <p>
      <input type="submit" value="Checkout" class="checkout-btn">
    </p>
  </form>

<!-- end of main cotnent -->

<!-- about footer starts here -->
  <div class="about">
    <p class="about-links">
      <a href="http://www.google.com" target="_blank" title="google">© 2016 by Google </a>
    </p>
 
  </div>
  </body>
</html>

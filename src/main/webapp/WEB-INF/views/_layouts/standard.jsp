<%@ include file="/WEB-INF/views/_taglibs.jspf" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><tiles:insertAttribute name="title"/> - Movie Booking</title>
	<link href="<c:url value="/images/onb_logo_tiny.ico" />" rel="icon" type="image/png" />
	<link type="text/css" rel="stylesheet" href="<c:url value="/webjars/bootstrap/3.3.6/css/bootstrap.min.css" />" />
	<link type="text/css" rel="stylesheet" href="<c:url value="/styles/main.css" />" />
</head>
<body>
	<nav id="navbar-header" class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">RewardsOnline</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<tiles:importAttribute name="navigationTab" />
				<ul class="nav navbar-nav">
					<li class="${navigationTab eq 'home' ? 'active' : ''}"><a href="<c:url value="/" />">Home</a></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">

				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>
	<div class="container">
		<tiles:insertAttribute name="main" />
	</div>
	<footer id="footer" class="footer">
		<div class="container">
			<p class="text-muted">&copy; Ruel Angelo Aballe</p>
		</div>
    </footer>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value='/webjars/jquery/2.1.4/jquery.min.js' />"></script>
<script src="<c:url value='/webjars/bootstrap/3.3.6/js/bootstrap.min.js' />"></script>
<tiles:importAttribute name="javascripts" /><c:if test="${not empty javascripts}">
<c:forEach var="script" items="${javascripts}"><script src="<c:url value="${script}"/>"></script>
</c:forEach>
</c:if>
</body>
</html>
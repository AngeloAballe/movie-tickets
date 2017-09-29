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
	<link type="text/css" rel="stylesheet" href="<c:url value="/css/AdminLTE.min.css" />" />
	<link type="text/css" rel="stylesheet" href="<c:url value="/css/skins/skin-blue.min.css" />" />

	<link type="text/css" rel="stylesheet" href="<c:url value="/bower_components/font-awesome/css/font-awesome.min.css" />" />
	<link type="text/css" rel="stylesheet" href="<c:url value="/bower_components/Ionicons/css/ionicons.min.css" />" />

	<tiles:importAttribute name="css" /><c:if test="${not empty css}">
	<c:forEach var="css" items="${css}">
		<link type="text/css" rel="stylesheet" href="<c:url value="${css}" />" />
	</c:forEach>
	</c:if>
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<!-- Main Header -->
		<header class="main-header">

			<!-- Logo -->
			<a href="/dashboard" class="logo">
				<!-- mini logo for sidebar mini 50x50 pixels -->
				<span class="logo-mini"><b>A</b>LT</span>
				<!-- logo for regular state and mobile devices -->
				<span class="logo-lg"><b>Movie</b>Booking</span>
			</a>

			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
					<span class="sr-only">Toggle navigation</span>
				</a>
			</nav>
		</header>

		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
			<section class="sidebar">
				<!-- Sidebar Menu -->
				<ul class="sidebar-menu" data-widget="tree">
					<li class="header">HEADER</li>
					<!-- Optionally, you can add icons to the links -->
					<li class="active"><a href="/dashboard"><i class="fa fa-link"></i> <span>Dashboard</span></a></li>
					<li class="treeview active menu-open">
						<a href="#"><i class="fa fa-link"></i> <span>Cinema</span>
							<span class="pull-right-container">
								<i class="fa fa-angle-left pull-right"></i>
						  	</span>
						</a>
						<ul class="treeview-menu">
							<li><a href="/cinema">View All Cinema</a></li>
							<li><a href="/cinema/create">Add Cinema</a></li>
						</ul>
					</li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Main content -->
			<section class="content container-fluid">
				<tiles:insertAttribute name="main" />
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
	</div>


	<%--<nav id="navbar-header" class="navbar navbar-default navbar-static-top">--%>
		<%--<div class="container">--%>
			<%--<div class="navbar-header">--%>
				<%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">--%>
					<%--<span class="sr-only">Toggle navigation</span>--%>
					<%--<span class="icon-bar"></span>--%>
					<%--<span class="icon-bar"></span>--%>
					<%--<span class="icon-bar"></span>--%>
				<%--</button>--%>
				<%--<a class="navbar-brand" href="#">RewardsOnline</a>--%>
			<%--</div>--%>
			<%--<div id="navbar" class="navbar-collapse collapse">--%>
				<%--<tiles:importAttribute name="navigationTab" />--%>
				<%--<ul class="nav navbar-nav">--%>
					<%--<li class="${navigationTab eq 'home' ? 'active' : ''}"><a href="<c:url value="/" />">Home</a></li>--%>
				<%--</ul>--%>
				<%--<ul class="nav navbar-nav navbar-right">--%>

				<%--</ul>--%>
			<%--</div><!--/.nav-collapse -->--%>
		<%--</div>--%>
	<%--</nav>--%>
	<%--<div class="container">--%>
		<%--<tiles:insertAttribute name="main" />--%>
	<%--</div>--%>
	<%--<footer id="footer" class="footer">--%>
		<%--<div class="container">--%>
			<%--<p class="text-muted">&copy; Ruel Angelo Aballe</p>--%>
		<%--</div>--%>
    <%--</footer>--%>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="<c:url value='/webjars/jquery/1.11.1/jquery.min.js' />"></script>
<script src="<c:url value='/webjars/bootstrap/3.3.6/js/bootstrap.min.js' />"></script>
<script src="<c:url value='/js/adminlte.min.js' />"></script>
<tiles:importAttribute name="javascripts" /><c:if test="${not empty javascripts}">
<c:forEach var="script" items="${javascripts}"><script src="<c:url value="${script}"/>"></script>
</c:forEach>
</c:if>
</body>
</html>

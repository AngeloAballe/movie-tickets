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
</head>
<body class="hold-transition skin-blue sidebar-mini">
	<div class="wrapper">
		<!-- Main Header -->
		<header class="main-header">

			<!-- Logo -->
			<a href="index2.html" class="logo">
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
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- Messages: style can be found in dropdown.less-->
						<li class="dropdown messages-menu">
							<!-- Menu toggle button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<i class="fa fa-envelope-o"></i>
								<span class="label label-success">4</span>
							</a>
							<ul class="dropdown-menu">
								<li class="header">You have 4 messages</li>
								<li>
									<!-- inner menu: contains the messages -->
									<ul class="menu">
										<li><!-- start message -->
											<a href="#">
												<div class="pull-left">
													<!-- User Image -->
													<img src="/img/user2-160x160.jpg" class="img-circle" alt="User Image">
												</div>
												<!-- Message title and timestamp -->
												<h4>
													Support Team
													<small><i class="fa fa-clock-o"></i> 5 mins</small>
												</h4>
												<!-- The message -->
												<p>Why not buy a new awesome theme?</p>
											</a>
										</li>
										<!-- end message -->
									</ul>
									<!-- /.menu -->
								</li>
								<li class="footer"><a href="#">See All Messages</a></li>
							</ul>
						</li>
						<!-- /.messages-menu -->

						<!-- Notifications Menu -->
						<li class="dropdown notifications-menu">
							<!-- Menu toggle button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<i class="fa fa-bell-o"></i>
								<span class="label label-warning">10</span>
							</a>
							<ul class="dropdown-menu">
								<li class="header">You have 10 notifications</li>
								<li>
									<!-- Inner Menu: contains the notifications -->
									<ul class="menu">
										<li><!-- start notification -->
											<a href="#">
												<i class="fa fa-users text-aqua"></i> 5 new members joined today
											</a>
										</li>
										<!-- end notification -->
									</ul>
								</li>
								<li class="footer"><a href="#">View all</a></li>
							</ul>
						</li>
						<!-- Tasks Menu -->
						<li class="dropdown tasks-menu">
							<!-- Menu Toggle Button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<i class="fa fa-flag-o"></i>
								<span class="label label-danger">9</span>
							</a>
							<ul class="dropdown-menu">
								<li class="header">You have 9 tasks</li>
								<li>
									<!-- Inner menu: contains the tasks -->
									<ul class="menu">
										<li><!-- Task item -->
											<a href="#">
												<!-- Task title and progress text -->
												<h3>
													Design some buttons
													<small class="pull-right">20%</small>
												</h3>
												<!-- The progress bar -->
												<div class="progress xs">
													<!-- Change the css width attribute to simulate progress -->
													<div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar"
														 aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
														<span class="sr-only">20% Complete</span>
													</div>
												</div>
											</a>
										</li>
										<!-- end task item -->
									</ul>
								</li>
								<li class="footer">
									<a href="#">View all tasks</a>
								</li>
							</ul>
						</li>
						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<!-- The user image in the navbar-->
								<img src="/img/user2-160x160.jpg" class="user-image" alt="User Image">
								<!-- hidden-xs hides the username on small devices so only the image appears. -->
								<span class="hidden-xs">Alexander Pierce</span>
							</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li class="user-header">
									<img src="/img/user2-160x160.jpg" class="img-circle" alt="User Image">

									<p>
										Alexander Pierce - Web Developer
										<small>Member since Nov. 2012</small>
									</p>
								</li>
								<!-- Menu Body -->
								<li class="user-body">
									<div class="row">
										<div class="col-xs-4 text-center">
											<a href="#">Followers</a>
										</div>
										<div class="col-xs-4 text-center">
											<a href="#">Sales</a>
										</div>
										<div class="col-xs-4 text-center">
											<a href="#">Friends</a>
										</div>
									</div>
									<!-- /.row -->
								</li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<a href="#" class="btn btn-default btn-flat">Profile</a>
									</div>
									<div class="pull-right">
										<a href="#" class="btn btn-default btn-flat">Sign out</a>
									</div>
								</li>
							</ul>
						</li>
						<!-- Control Sidebar Toggle Button -->
						<li>
							<a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
						</li>
					</ul>
				</div>
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
					<li class="treeview">
						<a href="#"><i class="fa fa-link"></i> <span>Cinema</span>
							<span class="pull-right-container">
								<i class="fa fa-angle-left pull-right"></i>
						  	</span>
						</a>
						<ul class="treeview-menu">
							<li><a href="#">View All Cinema</a></li>
							<li><a href="#">Add Cinema</a></li>
							<li><a href="#">View Cinema</a></li>
						</ul>
					</li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>


		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
					Page Header
					<small>Optional description</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>
					<li class="active">Here</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content container-fluid">

				<!--------------------------
                  | Your Page Content Here |
                  -------------------------->
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

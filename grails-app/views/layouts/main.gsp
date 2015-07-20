<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>mPurpose - Multipurpose Feature Rich Bootstrap Template</title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width">

		<link rel="stylesheet" href="${request.contextPath}/theme/css/bootstrap.min.css">
		<link rel="stylesheet" href="${request.contextPath}/theme/css/icomoon-social.css">
		<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>

		<link rel="stylesheet" href="${request.contextPath}/theme/css/leaflet.css" />
		<!--[if lte IE 8]>
				<link rel="stylesheet" href="${request.contextPath}/theme/css/leaflet.ie.css" />
			<![endif]-->
		<link rel="stylesheet" href="${request.contextPath}/theme/css/main.css">

		<script src="${request.contextPath}/theme/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
	</head>
	<body>
	<!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="${request.contextPath}/theme/http://browsehappy.com/">upgrade your browser</a> or <a href="${request.contextPath}/theme/http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->


	<!-- Navigation & Logo-->
	<div class="mainmenu-wrapper">
		<div class="container">
			<div class="menuextras">
				<div class="extras">
					<ul>
					</ul>
				</div>
			</div>
			<nav id="mainmenu" class="mainmenu">
				<ul>
					<li class="logo-wrapper"><a href="/DeliveryApp/home"><img src="${request.contextPath}/theme/img/eatBay.png" alt="Multipurpose Twitter Bootstrap Template"></a></li>
					<li class="active">
						<a href="/DeliveryApp/home">Home</a>
					</li>
					<li>
						<a href="/DeliveryApp/about">About Us</a>
					</li>
				</ul>
			</nav>
		</div>
	</div>

	<!-- main content -->
	<div id="page-content">
		<g:layoutBody/>
	</div>
	<!-- end main content -->

	<!-- Footer -->
	<div class="footer">
		<div class="container">
			<div class="row">
				<div class="col-footer col-md-8 col-xs-8">
					<h3>Contacts</h3>
					<p class="contact-us-details">
						<b>Address:</b> 123 Anwell Street, LN1 2ST, Ottawa, Canada<br/>
						<b>Phone:</b> 1-613-465-4321<br/>
						<b>Fax:</b> 1-613-365-4321<br/>
						<b>Email:</b> <a href="${request.contextPath}/theme/mailto:getintouch@eatBay.ca">getintouch@eatBay.ca</a>
					</p>
				</div>
				<div class="col-footer col-md-4 col-xs-4">
					<h3>Stay Connected</h3>
					<ul class="footer-stay-connected no-list-style">
						<li><a href="${request.contextPath}/theme/#" class="facebook"></a></li>
						<li><a href="${request.contextPath}/theme/#" class="twitter"></a></li>
						<li><a href="${request.contextPath}/theme/#" class="googleplus"></a></li>
					</ul>
				</div>
			</div>
			<div class="row">
				<div class="col-md-12">
					<div class="footer-copyright">&copy; 2015 eatBay. All rights reserved.</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Javascripts -->
	<script src="${request.contextPath}/theme/http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="${request.contextPath}/theme/js/jquery-1.9.1.min.js"><\/script>')</script>
	<script src="${request.contextPath}/theme/js/bootstrap.min.js"></script>
	<script src="${request.contextPath}/theme/http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js"></script>
	<script src="${request.contextPath}/theme/js/jquery.fitvids.js"></script>
	<script src="${request.contextPath}/theme/js/jquery.sequence-min.js"></script>
	<script src="${request.contextPath}/theme/js/jquery.bxslider.js"></script>
	<script src="${request.contextPath}/theme/js/main-menu.js"></script>
	<script src="${request.contextPath}/theme/js/template.js"></script>
	</body>
</html>

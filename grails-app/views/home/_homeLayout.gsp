<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>mPurpose - Multipurpose Feature Rich Bootstrap Template</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">

    <link rel="stylesheet" href="${request.contextPath}/css/bootstrap.min.css">
    <link rel="stylesheet" href="${request.contextPath}/css/icomoon-social.css">
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700,600,800' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="${request.contextPath}/css/leaflet.css" />
    <!--[if lte IE 8]>
		    <link rel="stylesheet" href="${request.contextPath}/css/leaflet.ie.css" />
		<![endif]-->
    <link rel="stylesheet" href="${request.contextPath}/css/main.css">

    <script src="${request.contextPath}/js/modernizr-2.6.2-respond-1.1.0.min.js"></script>
</head>
<body>
<!--[if lt IE 7]>
            <p class="chromeframe">You are using an <strong>outdated</strong> browser. Please <a href="${request.contextPath}/http://browsehappy.com/">upgrade your browser</a> or <a href="${request.contextPath}/http://www.google.com/chromeframe/?redirect=true">activate Google Chrome Frame</a> to improve your experience.</p>
        <![endif]-->


<!-- Navigation & Logo-->
<div class="mainmenu-wrapper">
    <div class="container">
        <div class="menuextras">
            <div class="extras">
                <ul>
                    <li class="shopping-cart-items"><i class="glyphicon glyphicon-shopping-cart icon-white"></i> <a href="${request.contextPath}/page-shopping-cart.html"><b>3 items</b></a></li>
                    <li>
                        <div class="dropdown choose-country">
                            <a class="#" data-toggle="dropdown" href="${request.contextPath}/#"><img src="${request.contextPath}/img/flags/gb.png" alt="Great Britain"> UK</a>
                            <ul class="dropdown-menu" role="menu">
                                <li role="menuitem"><a href="${request.contextPath}/#"><img src="${request.contextPath}/img/flags/us.png" alt="United States"> US</a></li>
                                <li role="menuitem"><a href="${request.contextPath}/#"><img src="${request.contextPath}/img/flags/de.png" alt="Germany"> DE</a></li>
                                <li role="menuitem"><a href="${request.contextPath}/#"><img src="${request.contextPath}/img/flags/es.png" alt="Spain"> ES</a></li>
                            </ul>
                        </div>
                    </li>
                    <li><a href="${request.contextPath}/page-login.html">Login</a></li>
                </ul>
            </div>
        </div>
        <nav id="mainmenu" class="mainmenu">
            <ul>
                <li class="logo-wrapper"><a href="${request.contextPath}/index.html"><img src="${request.contextPath}/img/mPurpose-logo.png" alt="Multipurpose Twitter Bootstrap Template"></a></li>
                <li class="active">
                    <a href="${request.contextPath}/index.html">Home</a>
                </li>
                <li>
                    <a href="${request.contextPath}/features.html">Features</a>
                </li>
                <li class="has-submenu">
                    <a href="${request.contextPath}/#">Pages +</a>
                    <div class="mainmenu-submenu">
                        <div class="mainmenu-submenu-inner">
                            <div>
                                <h4>Homepage</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/index.html">Homepage (Sample 1)</a></li>
                                    <li><a href="${request.contextPath}/page-homepage-sample.html">Homepage (Sample 2)</a></li>
                                </ul>
                                <h4>Services & Pricing</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-services-1-column.html">Services/Features (Rows)</a></li>
                                    <li><a href="${request.contextPath}/page-services-3-columns.html">Services/Features (3 Columns)</a></li>
                                    <li><a href="${request.contextPath}/page-services-4-columns.html">Services/Features (4 Columns)</a></li>
                                    <li><a href="${request.contextPath}/page-pricing.html">Pricing Table</a></li>
                                </ul>
                                <h4>Team & Open Vacancies</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-team.html">Our Team</a></li>
                                    <li><a href="${request.contextPath}/page-vacancies.html">Open Vacancies (List)</a></li>
                                    <li><a href="${request.contextPath}/page-job-details.html">Open Vacancies (Job Details)</a></li>
                                </ul>
                            </div>
                            <div>
                                <h4>Our Work (Portfolio)</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-portfolio-2-columns-1.html">Portfolio (2 Columns, Option 1)</a></li>
                                    <li><a href="${request.contextPath}/page-portfolio-2-columns-2.html">Portfolio (2 Columns, Option 2)</a></li>
                                    <li><a href="${request.contextPath}/page-portfolio-3-columns-1.html">Portfolio (3 Columns, Option 1)</a></li>
                                    <li><a href="${request.contextPath}/page-portfolio-3-columns-2.html">Portfolio (3 Columns, Option 2)</a></li>
                                    <li><a href="${request.contextPath}/page-portfolio-item.html">Portfolio Item (Project) Description</a></li>
                                </ul>
                                <h4>General Pages</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-about-us.html">About Us</a></li>
                                    <li><a href="${request.contextPath}/page-contact-us.html">Contact Us</a></li>
                                    <li><a href="${request.contextPath}/page-faq.html">Frequently Asked Questions</a></li>
                                    <li><a href="${request.contextPath}/page-testimonials-clients.html">Testimonials & Clients</a></li>
                                    <li><a href="${request.contextPath}/page-events.html">Events</a></li>
                                    <li><a href="${request.contextPath}/page-404.html">404 Page</a></li>
                                    <li><a href="${request.contextPath}/page-sitemap.html">Sitemap</a></li>
                                    <li><a href="${request.contextPath}/page-login.html">Login</a></li>
                                    <li><a href="${request.contextPath}/page-register.html">Register</a></li>
                                    <li><a href="${request.contextPath}/page-password-reset.html">Password Reset</a></li>
                                    <li><a href="${request.contextPath}/page-terms-privacy.html">Terms & Privacy</a></li>
                                    <li><a href="${request.contextPath}/page-coming-soon.html">Coming Soon</a></li>
                                </ul>
                            </div>
                            <div>
                                <h4>eShop</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-products-3-columns.html">Products listing (3 Columns)</a></li>
                                    <li><a href="${request.contextPath}/page-products-4-columns.html">Products listing (4 Columns)</a></li>
                                    <li><a href="${request.contextPath}/page-products-slider.html">Products Slider</a></li>
                                    <li><a href="${request.contextPath}/page-product-details.html">Product Details</a></li>
                                    <li><a href="${request.contextPath}/page-shopping-cart.html">Shopping Cart</a></li>
                                </ul>
                                <h4>Blog</h4>
                                <ul>
                                    <li><a href="${request.contextPath}/page-blog-posts.html">Blog Posts (List)</a></li>
                                    <li><a href="${request.contextPath}/page-blog-post-right-sidebar.html">Blog Single Post (Right Sidebar)</a></li>
                                    <li><a href="${request.contextPath}/page-blog-post-left-sidebar.html">Blog Single Post (Left Sidebar)</a></li>
                                    <li><a href="${request.contextPath}/page-news.html">Latest & Featured News</a></li>
                                </ul>
                            </div>
                        </div><!-- /mainmenu-submenu-inner -->
                    </div><!-- /mainmenu-submenu -->
                </li>
                <li>
                    <a href="${request.contextPath}/credits.html">Credits</a>
                </li>
            </ul>
        </nav>
    </div>
</div>




<!-- Footer -->
<div class="footer">
    <div class="container">
        <div class="row">
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Our Latest Work</h3>
                <div class="portfolio-item">
                    <div class="portfolio-image">
                        <a href="${request.contextPath}/page-portfolio-item.html"><img src="${request.contextPath}/img/portfolio6.jpg" alt="Project Name"></a>
                    </div>
                </div>
            </div>
            <div class="col-footer col-md-3 col-xs-6">
                <h3>Navigate</h3>
                <ul class="no-list-style footer-navigate-section">
                    <li><a href="${request.contextPath}/page-blog-posts.html">Blog</a></li>
                    <li><a href="${request.contextPath}/page-portfolio-3-columns-2.html">Portfolio</a></li>
                    <li><a href="${request.contextPath}/page-products-3-columns.html">eShop</a></li>
                    <li><a href="${request.contextPath}/page-services-3-columns.html">Services</a></li>
                    <li><a href="${request.contextPath}/page-pricing.html">Pricing</a></li>
                    <li><a href="${request.contextPath}/page-faq.html">FAQ</a></li>
                </ul>
            </div>

            <div class="col-footer col-md-4 col-xs-6">
                <h3>Contacts</h3>
                <p class="contact-us-details">
                    <b>Address:</b> 123 Fake Street, LN1 2ST, London, United Kingdom<br/>
                    <b>Phone:</b> +44 123 654321<br/>
                    <b>Fax:</b> +44 123 654321<br/>
                    <b>Email:</b> <a href="${request.contextPath}/mailto:getintoutch@yourcompanydomain.com">getintoutch@yourcompanydomain.com</a>
                </p>
            </div>
            <div class="col-footer col-md-2 col-xs-6">
                <h3>Stay Connected</h3>
                <ul class="footer-stay-connected no-list-style">
                    <li><a href="${request.contextPath}/#" class="facebook"></a></li>
                    <li><a href="${request.contextPath}/#" class="twitter"></a></li>
                    <li><a href="${request.contextPath}/#" class="googleplus"></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <div class="footer-copyright">&copy; 2013 mPurpose. All rights reserved.</div>
            </div>
        </div>
    </div>
</div>

<!-- Javascripts -->
<script src="${request.contextPath}/http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="${request.contextPath}/js/jquery-1.9.1.min.js"><\/script>')</script>
<script src="${request.contextPath}/js/bootstrap.min.js"></script>
<script src="${request.contextPath}/http://cdn.leafletjs.com/leaflet-0.5.1/leaflet.js"></script>
<script src="${request.contextPath}/js/jquery.fitvids.js"></script>
<script src="${request.contextPath}/js/jquery.sequence-min.js"></script>
<script src="${request.contextPath}/js/jquery.bxslider.js"></script>
<script src="${request.contextPath}/js/main-menu.js"></script>
<script src="${request.contextPath}/js/template.js"></script>

</body>
</html>
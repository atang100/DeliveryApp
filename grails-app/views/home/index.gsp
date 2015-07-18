<%--
  Created by IntelliJ IDEA.
  User: Andy
  Date: 7/15/2015
  Time: 12:28 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <%-- <meta name="layout" content="main"/>--%>
</head>

<body>
<g:applyLayout name="main" params="[test: 3434243]">


    <div class="section">
        <div class="container">
            <div class="blog-post col-md-12">
                <h2>Most Popular Restaurants</h2>
                <!-- Table -->
                <table class="table table-striped" data-toggle="table">
                    <thead>
                    <tr>
                        <th class="">&nbsp;</th>
                        <th class="">Restaurant</th>
                        <th class="">Delivery Charge</th>
                        <th class="">Time Estimate</th>
                        <th class="">&nbsp;</th>
                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${mostPopularRestaurantList}" var="varMpr">
                        <tr>
                            <td><img src="http://lorempixel.com/200/125/food" class="img-responsive"/></td>
                            <td><strong>${varMpr.restName}</strong><br><br>
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                            </td>
                            <td>$5.00</td>
                            <td>${varMpr.deliveryTime} minutes</td>
                            <td><a href="#">Order Now</a></td>
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</g:applyLayout>
</body>
</html>
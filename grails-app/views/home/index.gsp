<%--
  Created by IntelliJ IDEA.
  User: Andy
  Date: 7/15/2015
  Time: 12:28 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>

<g:applyLayout name="main">

    <div class="section">
        <div class="container">
            <div class="row">
                <div class="col-md-10">
                    <!-- Table -->
                    <div class="panel panel-default">
                        <table class="table table-striped tablesorter" id="restaurantTable">
                            <thead>
                            <tr>
                                <th class="">&nbsp;</th>
                                <g:sortableColumn class="tabtitle" property="restName" title="Restaurant" titleKey="restaurant.restName" />
                                <!--<th class="">Restaurant</th>-->
                                <th class="">Delivery Charge</th>
                                <!--<th class="">Time Estimate</th>-->
                                <g:sortableColumn class="tabtitle" property="deliveryTime" title="Delivery Time" titleKey="restaurant.deliveryTime" />
                                <th class="">&nbsp;</th>
                            </tr>
                            </thead>
                            <tbody>
                            <g:each in="${restaurantList}" var="varRestaurant" status="varStatus">
                                <tr>
                                    <td><img src="http://lorempixel.com/200/125/food/${varStatus % 11}"
                                             class="img-responsive"/></td>
                                    <td><strong>${varRestaurant.restName}</strong><br><br>
                                        Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                    </td>
                                    <td>$5.00</td>
                                    <td>${varRestaurant.deliveryTime} minutes</td>
                                    <td>
                                        <g:link controller="menu" action="displayMenu"
                                                params="[restName: varRestaurant.restName]" class="btn btn-blue">Order Now</g:link></td>
                                </tr>
                            </g:each>
                            </tbody>
                        </table>
                    </div>
                </div>

                <div class="col-md-2">
                    <div class="blog-post text-center">
                        <h4>Most Popular Restaurants</h4> <br>
                        <g:each in="${mostPopularRestaurantList}" var="varMpr" status="varStatus">
                            <div class="portfolio-item">
                                <span class="centered center-block">
                                    <g:link controller="menu" action="displayMenu"
                                            params="[restName: varMpr.restName]">
                                        <img src="http://lorempixel.com/100/100/food/${varStatus.toString()}"
                                             class="img-responsive centered" style="margin: 0 auto;"/>
                                    </g:link>
                                    <strong>${varMpr.restName}</strong>
                                </span>
                            </div>
                        </g:each>
                    </div>
                </div>
            </div>
        </div>
    </div>

</g:applyLayout>

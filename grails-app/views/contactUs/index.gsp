<%--
  Created by IntelliJ IDEA.
  User: Andy
  Date: 7/19/2015
  Time: 6:55 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>

<g:applyLayout name="main">

    <div class="section">
        <div class="container">
             <div id="map-canvas"></div>
        </div>
    </div>

    <script src="https://maps.googleapis.com/maps/api/js?v=3.exp"></script>
    <script>
        var map;
        function initialize() {
            map = new google.maps.Map(document.getElementById('map-canvas'), {
                zoom: 8,
                center: {lat: -34.397, lng: 150.644}
            });
        }
        google.maps.event.addDomListener(window, 'load', initialize);
    </script>

</g:applyLayout>

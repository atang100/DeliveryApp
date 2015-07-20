<%--
  Created by IntelliJ IDEA.
  User: Zeref
  Date: 7/18/2015
  Time: 10:41 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<g:applyLayout name="main" params="[test: 3434243]">
    <div class="section">
        <div class="container">
            <div class="row">
                <div class="blog-post col-md-12">
                    <br>
                    <h1>Summary</h1><hr> <br>
                    <div id="map-container" class="col-md-6" style="height: 500px;"></div>
                    <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
                    <script>

                        function init_map() {
                            var var_location = new google.maps.LatLng(45.430817,12.331516);

                            var var_mapoptions = {
                                center: var_location,
                                zoom: 14
                            };

                            var var_marker = new google.maps.Marker({
                                position: var_location,
                                map: var_map,
                                title:"Venice"});

                            var var_map = new google.maps.Map(document.getElementById("map-container"),
                                    var_mapoptions);

                            var_marker.setMap(var_map);

                        }

                        google.maps.event.addDomListener(window, 'load', init_map);

                    </script>
                </div>
            </div>
        </div>
    </div>
</g:applyLayout>

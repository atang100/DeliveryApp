<%--
  Created by IntelliJ IDEA.
  User: Andy
  Date: 7/18/2015
  Time: 2:51 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
    <%-- <meta name="layout" content="main"/>--%>
</head>

<body>
<g:applyLayout name="main">
    <!-- Page Title -->
    <div class="section section-breadcrumbs">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <h1>${restName}</h1>
                </div>
            </div>
        </div>
    </div>

    <div class="section">
        <div class="container">
            <g:if test="${flash.message}">
                <div class="flash fade-in alert alert-danger" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    ${flash.message}
                </div>
            </g:if>
            <!-- Cart -->
            <div class="col-md-5">
                <div class="blog-post" id="cartDiv">
                    <g:render template="cart" model="[shoppingCart: shoppingCart, restName: restName]" />
                </div>
            </div>
            <!-- Menu -->
            <div class="col-md-7">
                <div class="blog-post">
                    <h2>Appetizer</h2>
                    <!-- Table -->
                    <table class="table table-striped" data-toggle="table">
                        <tbody>
                        <g:each in="${menuList}" var="varMenu">
                            <g:if test="${varMenu.type == 'appetizer'}">
                                <tr>
                                    <td><strong>${varMenu.itemName}</strong><br><br>
                                        ${varMenu.description}
                                    </td>
                                    <td>$${varMenu.convertPriceToString()}</td>
                                    <td class="col-md-2">
                                        <button class="btn-grey" type="button" name="decrement${varMenu.itemName}"
                                                onclick="decrementItem(${varMenu.itemId})">-</button>
                                        <button class="btn-blue" type="button" name="increment${varMenu.itemName}"
                                                onclick="incrementItem(${varMenu.itemId})">+</button>
                                    </td>
                                </tr>
                            </g:if>
                        </g:each>
                        </tbody>
                    </table>

                    <h2>Mains</h2>
                    <!-- Table -->
                    <table class="table table-striped" data-toggle="table">
                        <tbody>
                        <g:each in="${menuList}" var="varMenu">
                            <g:if test="${varMenu.type == 'mains'}">
                                <tr>
                                    <td><strong>${varMenu.itemName}</strong><br><br>
                                        ${varMenu.description}
                                    </td>
                                    <td>$${varMenu.convertPriceToString()}</td>
                                    <td class="col-md-2">
                                        <button class="btn-grey" type="button" name="decrement${varMenu.itemName}"
                                                onclick="decrementItem(${varMenu.itemId})">-</button>
                                        <button class="btn-blue" type="button" name="increment${varMenu.itemName}"
                                                onclick="incrementItem(${varMenu.itemId})">+</button>
                                    </td>
                                </tr>
                            </g:if>
                        </g:each>
                        </tbody>
                    </table>

                    <h2>Desserts</h2>
                    <!-- Table -->
                    <table class="table table-striped" data-toggle="table">
                        <tbody>
                        <g:each in="${menuList}" var="varMenu">
                            <g:if test="${varMenu.type == 'dessert'}">
                                <tr>
                                    <td><strong>${varMenu.itemName}</strong><br><br>
                                        ${varMenu.description}
                                    </td>
                                    <td>$${varMenu.convertPriceToString()}</td>
                                    <td class="col-md-2">
                                        <button class="btn-grey" type="button" name="decrement${varMenu.itemName}"
                                                onclick="decrementItem(${varMenu.itemId})">-</button>
                                        <button class="btn-blue" type="button" name="increment${varMenu.itemName}"
                                                onclick="incrementItem(${varMenu.itemId})">+</button>
                                    </td>
                                </tr>
                            </g:if>
                        </g:each>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <script>
        function incrementItem(itemId) {
            <g:remoteFunction update="cartDiv" controller="menu" action="incrementItem" params="'shoppingCartId='+${shoppingCartId} + '&restName='+'${restName}' +'&itemId=' +itemId"/>
        }
        function decrementItem(itemId) {
            <g:remoteFunction update="cartDiv" controller="menu" action="decrementItem" params="'shoppingCartId='+${shoppingCartId} + '&restName='+'${restName}' +'&itemId=' +itemId"/>
        }

        window.setTimeout(function() {
            $(".flash").fadeTo(300, 0).slideUp(300, function(){
                $(this).remove();
            });
        }, 4000);
    </script>

</g:applyLayout>

</body>
</html>
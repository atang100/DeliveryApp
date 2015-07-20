<%--
  Created by IntelliJ IDEA.
  User: Zeref
  Date: 7/18/2015
  Time: 10:41 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<g:applyLayout name="main">

    <div class="container">
        <div class="row">
            <div class="blog-post col-md-12">
                <br>

                <h1>Summary - ${restaurant.restName}</h1><hr>

                <g:form name="myForm" action="" class="col-md-6">
                    <h3>Billing Information</h3>
                </g:form>

                <div class="col-md-6">
                    <div class="panel panel-default">
                        <!-- Default panel contents -->
                        <div class="panel-heading"><strong>Items in Cart</strong></div>

                        <div class="panel-body">
                            <p>The following items are available and ready for checkout. A confirmation will be provided once the order has been processed.</p>
                        </div>

                        <!-- Table -->
                        <table class="table table-striped text-center">
                            <thead>
                            <tr>
                                <th class="text-center">Item Name</th>
                                <th class="text-center">Price (each)</th>
                                <th class="text-center">Quantity</th>
                                <th class="text-center">&nbsp;</th>
                            </tr>
                            </thead>
                            <tbody>
                            <g:each in="${shoppingCartItemList}" var="item">
                                <tr>
                                    <td>${item.itemName}
                                    </td>
                                    <td>$ ${item.convertIndividualPriceToString()}</td>
                                    <td>${item.quantity}</td>
                                    <td>$ ${item.convertPriceToString()}</td>
                                </tr>
                            </g:each>
                            <tr>
                                <td colspan="4">&nbsp;</td>
                            </tr>

                            <tr>
                                <td>&nbsp;</td>
                                <td class="text-right" colspan="2"><strong>Subtotal:</strong> <br>
                                    <strong>Shipping Fee:</strong> <br>
                                    <strong>GST & HST:</strong> <br>
                                </td>
                                <td>
                                    $ ${shoppingCart.findSubTotal()} <br>
                                    $&nbsp; 5.00 <br>
                                    $&nbsp; ${shoppingCart.findTax()} <br>
                                </td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td class="text-right text-danger" colspan="2"><strong>Grand Total:</strong></td>
                                <td class="text-danger">$ ${shoppingCart.findTotal()}</td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>

</g:applyLayout>

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

                <h1>Order Summary - ${restaurant.restName}</h1><hr>

                <div class="col-md-6">
                    <h3><strong>Order #:</strong> 4578215</h3>
                    <h4><strong>Date:</strong> 22/07/2015</h4>
                    <br>

                    <p>Thank you placing your order! Your order has been processed. You will be notified once it has shipped.</p>

                    <p>Please keep this receipt for your records.</p>
                    <br> <br>

                    <h4>Payment Information</h4>

                    <p><strong>Credit Card Type:</strong> ${ccType}</p>

                    <p><strong>Credit Card Number:</strong> ${ccNum}</p>

                    <p><strong>Amount Charged:</strong> $${shoppingCart.findTotal()}</p>

                    <br>

                    <h4>Delivery Information</h4>

                    <p><strong>Receipient Name:</strong> ${fullName}</p>

                    <p><strong>Address:</strong><br>
                        ${streetName},<br>
                        ${city}, ON<br>
                        ${postalCode}
                    </p>

                    <p><strong>Email:</strong>${email}</p>

                    <p><strong>Phone Number:</strong> ${phone}</p>
                    <br><br>
                </div>

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

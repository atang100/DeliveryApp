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
                    <h2>Checkout</h2>

                    <div id="errorAlert" class="alert alert-danger collapse">
                        <button type="button" class="close" onclick="hideError();">×</button>
                        <span id="fNameErrorAlert"
                              class="collapse"><strong>Invalid Full Name!</strong> Cannot be blank.<br></span>
                        <span id="ccNumErrorAlert"
                              class="collapse"><strong>Invalid Credit Card Number!</strong> Please enter a valid credit card number.<br>
                        </span>
                        <span id="ccExpErrorAlert"
                              class="collapse"><strong>Invalid Expiry Date!</strong> The expected format is MMYY. (ex. 0917 for September 2017) <br>
                        </span>
                        <span id="ccCwErrorAlert"
                              class="collapse"><strong>Invalid CW!</strong> Please enter a valid CW.<br></span>

                        <span id="streetNameErrorAlert"
                              class="collapse"><strong>Street Name!</strong> Cannot be blank.<br></span>
                        <span id="cityErrorAlert"
                              class="collapse"><strong>Invalid City!</strong> Please enter a valid city.<br></span>
                        <span id="postalCodeErrorAlert"
                              class="collapse"><strong>Invalid Postal Code!</strong> Please enter a valid postal code. <br>
                        </span>
                    </div>

                    <g:form name="myForm" action="save" id="1" class="col-md-6">
                        <h3>Billing Information</h3>
                        <br>

                        <div class="form-group">
                            <label for="fullName">Full Name</label>
                            <input type="text" class="form-control" id="fullName" placeholder="Full Name" required>
                            <label for="fullName" class="text-danger collapse"
                                   id="fNameErrorMessage">Full Name cannot be blank.</label>
                        </div>

                        <div class="form-group">
                            <label for="ccNum">Credit Card Number</label>

                            <div class="input-group">
                                <input type="text" id="ccNum" class="form-control col-md-6" maxlength="16"
                                       placeholder="Credit Card Number" aria-label="..." required>
                                <span class="input-group-addon">
                                    <select id="lunch" class="selectpicker" data-live-search="true" title="Visa">
                                        <option>Visa</option>
                                        <option>Mastercard</option>
                                        <option>Amex</option>
                                    </select></span>
                            </div>
                            <label for="ccNum" class="text-danger collapse"
                                   id="ccNumErrorMessage">Invalid Credit Card Number.</label>
                            <br>
                            <label for="ccExpDate">Expiry Date</label>
                            <input type="text" class="form-control" id="ccExpDate" maxlength="4"
                                   placeholder="Expiry Date MMYY" required>
                            <label for="ccExpDate" class="text-danger collapse"
                                   id="expDateErrorMessage">Invalid Expiry Date.</label>
                            <br>
                            <label for="ccCw">CW</label>
                            <input type="text" class="form-control" id="ccCw" placeholder="CW" required>
                            <label for="ccCw" class="text-danger collapse" id="cwErrorMessage">Invalid CW.</label>
                        </div>
                        <hr>

                        <h3>Shipping Information</h3>
                        <br>

                        <div class="form-group">
                            <label for="streetName">Street Name</label>
                            <input type="text" class="form-control" id="streetName" placeholder="Address" required>
                            <label for="streetName" class="text-danger collapse"
                                   id="streetNameErrorMessage">Invalid Street Name.</label>
                            <br>
                            <label for="city">City</label>
                            <input type="text" class="form-control" id="city" placeholder="City" required>
                            <label for="city" class="text-danger collapse" id="cityErrorMessage">Invalid City.</label>
                            <br>
                            <label for="postalCode">Postal Code</label>
                            <input type="text" class="form-control" id="postalCode" placeholder="Postal Code" required>
                            <label for="postalCode" class="text-danger collapse"
                                   id="postalCodeErrorMessage">Invalid Postal Code.</label>
                            <br>
                            <label for="phone">Phone</label>
                            <input type="tel" class="form-control" id="phone" placeholder="Phone Number">
                        </div>
                        <g:actionSubmit value="Save" class="btn pull-right"/>
                        <!--<button onclick="fakeSubmit();" type="button" class="btn pull-right">Process My Order</button>-->
                        <div class="clearfix"></div>
                        <br>
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
    </div>
</g:applyLayout>
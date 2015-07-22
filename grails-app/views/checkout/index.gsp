<%--
  Created by IntelliJ IDEA.
  User: Zeref
  Date: 7/18/2015
  Time: 10:41 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<g:applyLayout name="main" params="[test: 3434243]">
    <div class="">
        <div class="container">
            <div class="row">
                <div class="blog-post col-md-12">

                    <h1>Checkout - ${restaurant.restName}</h1><hr>

                    <div id="errorAlert" class="alert alert-danger collapse">
                        <button type="button" class="close" onclick="hideError();">×</button>
                        <span id="fNameErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid Full Name!</strong> Cannot be blank.<br>
                        </span>
                        <span id="ccNumErrorAlert"
                              class="collapse"><strong>Invalid Credit Card Number!</strong> Please enter a valid credit card number.<br>
                        </span>
                        <span id="ccExpErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid Expiry Date!</strong> The expected format is MMYY. (ex. 0917 for September 2017) <br>
                        </span>
                        <span id="ccCwErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid CVV!</strong> Please enter a valid CVV.<br>
                        </span>

                        <span id="streetNameErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid Street Name!</strong> Cannot be blank.<br>
                        </span>
                        <span id="cityErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid City!</strong> Please enter a valid city.<br>
                        </span>
                        <span id="postalCodeErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid Postal Code!</strong> Please enter a valid postal code. <br>
                        </span>
                        <span id="emailErrorAlert"
                              class="collapse customValidationAlert"><strong>Invalid Email!</strong> Please enter a valid email address.<br>
                        </span>
                    </div>

                    <g:form name="myForm" id="myForm" controller="summary" action="index" class="col-md-6">
                        <h3>Billing Information</h3>
                        <br>

                        <div class="form-group">
                            <label for="fullName">Full Name</label>
                            <g:textField name="fullName" class="form-control" id="fullName" placeholder="Full Name"
                                         required="required"></g:textField>
                            <!--<input type="text" class="form-control" id="fullName" placeholder="Full Name" required>-->
                            <label for="fullName" class="text-danger collapse"
                                   id="fNameErrorMessage">Full Name cannot be blank.</label>
                        </div>

                        <div class="form-group">
                            <label for="ccNum">Credit Card Number</label>

                            <div class="input-group">
                                <g:textField name="ccNum" id="ccNum" class="form-control col-md-6" maxlength="19"
                                             placeholder="Credit Card Number" required="required"></g:textField>
                                <!--<input type="text" id="ccNum" class="form-control col-md-6" maxlength="19"
                                       placeholder="Credit Card Number" aria-label="..." required>-->
                                <span class="input-group-addon">
                                    <g:select name="ccType"
                                              from="${Arrays.asList("Visa", "Mastercard", "American Express")}"
                                              value="Visa" class="selectpicker" id="ccType"/>
                                </span>
                            </div>
                            <label for="ccNum" class="text-danger collapse"
                                   id="ccNumErrorMessage">Invalid Credit Card Number.</label>
                            <br>
                            <label for="ccExpDate">Expiry Date</label>
                            <g:textField name="ccExpDate" class="form-control" id="ccExpDate" maxlength="4"
                                         placeholder="Expiry Date MMYY" required="required"></g:textField>

                            <label for="ccExpDate" class="text-danger collapse"
                                   id="expDateErrorMessage">Invalid Expiry Date.</label>
                            <br>
                            <label for="ccCw">CVV</label>
                            <g:textField name="ccCw" class="form-control" id="ccCw" placeholder="CVV" maxlength="4"
                                         required="required"></g:textField>
                            <label for="ccCw" class="text-danger collapse" id="cwErrorMessage">Invalid CVV.</label>
                        </div>
                        <hr>

                        <h3>Shipping Information</h3>
                        <br>

                        <div class="form-group">
                            <label for="streetName">Street Name</label>
                            <g:textField name="streetName" class="form-control" id="streetName" placeholder="Address"
                                         required="required"></g:textField>
                            <label for="streetName" class="text-danger collapse"
                                   id="streetNameErrorMessage">Invalid Street Name.</label>
                            <br>
                            <label for="city">City</label>
                            <g:select name="city" from="${Arrays.asList("Ottawa", "Toronto")}"
                                      noSelection="['': '-Choose City-']" class="form-control" id="city"/>
                            <label for="city" class="text-danger collapse"
                                   id="cityErrorMessage">Please select a city.</label>
                            <br>
                            <label for="postalCode">Postal Code</label>
                            <g:textField name="postalCode" class="form-control" id="postalCode"
                                         placeholder="Postal Code" maxlength="7" required="required"></g:textField>

                            <label for="postalCode" class="text-danger collapse"
                                   id="postalCodeErrorMessage">Invalid Postal Code.</label>
                            <br>
                            <label for="postalCode">Email</label>
                            <g:textField name="emailAddress" class="form-control" id="emailAddress"
                                         placeholder="Email" required="required"></g:textField>

                            <label for="emailAddress" class="text-danger collapse"
                                   id="emailAddressErrorMessage">Invalid Email.</label>
                            <br>
                            <label for="phone">Phone</label>
                            <g:textField name="phone" class="form-control" id="phone" maxlength="10"
                                         placeholder="Phone Number"></g:textField>
                            <g:hiddenField name="shoppingCartId" value="${shoppingCart.id}"/>
                            <g:hiddenField name="restName" value="${restaurant.restName}"/>
                        </div>

                        <g:actionSubmit value="Complete Order" class="hidden" id="formSubmit" action="index"/>
                        <g:link controller="menu"
                                action="redisplayCart"
                                params="[shoppingCartId: shoppingCart.id, restName: restaurant.restName]"
                                class="btn btn-grey col-md-6">Go Back</g:link>
                        <button onclick="fakeSubmit();" type="button"
                                class="btn btn-blue col-md-6">Process My Order</button>

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

<script>
    $('#fullName').focusout(validateFullName);
    $('#ccNum').focusout(validateCcNumber);
    $('#ccExpDate').focusout(validateExpDate);
    $('#ccCw').focusout(validateCw);
    $('#streetName').focusout(validateStreetName);
    $('#city').focusout(validateCity);
    $('#postalCode').focusout(validatePostalCode);
    $('#emailAddress').focusout(validateEmail);

    var readyToSubmit = true;

    function validateFullName() {
        //insert validation
        var isValid = true;
        if ($('#fullName').val() == "") {
            $('#fNameErrorMessage').show();
            isValid = false;
        }
        else {
            $('#fNameErrorMessage').hide();
            $("#fNameErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateCcNumber() {
        //insert validation
        var isValid = true;
        if ($('#ccNum').val().toString().length < 13 || $('#ccNum').val().toString().length > 19) {
            $('#ccNumErrorMessage').show();
            isValid = false;
        }
        else {
            $('#ccNumErrorMessage').hide();
            $("#ccNumErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateExpDate() {
        //insert validation
        var isValid = true;
        if ($('#ccExpDate').val().toString().length != 4) {
            $('#expDateErrorMessage').show();
            isValid = false;
        }
        else {
            $('#expDateErrorMessage').hide();
            $("#ccExpErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateCw() {
        //insert validation
        var isValid = true;
        if ($('#ccCw').val() == "" || $('#ccCw').val().length < 3 || $('#ccCw').val().length > 4) {
            $('#cwErrorMessage').show();
            isValid = false;
        }
        else {
            $('#cwErrorMessage').hide();
            $("#ccCwErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateStreetName() {
        //insert validation
        var isValid = true;
        if ($('#streetName').val() == "") {
            $('#streetNameErrorMessage').show();
            isValid = false;
        }
        else {
            $('#streetNameErrorMessage').hide();
            $("#streetNameErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateCity() {
        //insert validation
        var isValid = true;
        if ($('#city').val() == "") {
            $('#cityErrorMessage').show();
            isValid = false;
        }
        else {
            $('#cityErrorMessage').hide();
            $("#cityErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validatePostalCode() {
        //insert validation
        var isValid = true;
        if ($('#postalCode').val() == "") {
            $('#postalCodeErrorMessage').show();
            isValid = false;
        }
        else {
            $('#postalCodeErrorMessage').hide();
            $("#postalCodeErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function validateEmail() {
        var isValid = true;
        //insert validation
        if (!IsEmail(document.getElementById('emailAddress').value.toString())) {
            //alert('emailErrorMessage');
            $('#emailAddressErrorMessage').text("Invalid Email. Please enter a valid email address.");
            $('#emailAddressErrorMessage').show();
            isValid = false;
        }
        else {
            $('#emailAddressErrorMessage').hide();
            $("#emailErrorAlert").hide();
            doIfAlertAllHidden();
        }
        return isValid;
    }

    function IsEmail(email) {
        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        return regex.test(email);
    }


    //for the submit button
    function fakeSubmit() {
        var readyToSubmit = true;
        if (!validateFullName()) {
            $("#fNameErrorAlert").show();
            readyToSubmit = false;
        }
        else {
            $("#fNameErrorAlert").hide();
        }

        if (!validateCcNumber()) {
            $("#ccNumErrorAlert").show();
            readyToSubmit = false;
        }
        else {
            $("#ccNumErrorAlert").hide();
        }

        if (!validateExpDate()) {
            readyToSubmit = false;
            $("#ccExpErrorAlert").show();
        }
        else {
            $("#ccExpErrorAlert").hide();
        }

        if (!validateCw()) {
            readyToSubmit = false;
            $("#ccCwErrorAlert").show();
        }
        else {
            $("#ccCwErrorAlert").hide();
        }

        if (!validateStreetName()) {
            readyToSubmit = false;
            $("#streetNameErrorAlert").show();
        }
        else {
            $("#streetNameErrorAlert").hide();
        }

        if (!validateCity()) {
            readyToSubmit = false;
            $("#cityErrorAlert").show();
        }
        else {
            $("#cityErrorAlert").hide();
        }

        if (!validatePostalCode()) {
            readyToSubmit = false;
            $("#postalCodeErrorAlert").show();
        }
        else {
            $("#postalCodeErrorAlert").hide();
        }

        if (!validateEmail()) {
            readyToSubmit = false;
            $("#emailErrorAlert").show();
        }
        else {
            $("#emailErrorAlert").hide();
        }

        if (readyToSubmit) {
            $("#errorAlert").hide();
            $('#formSubmit').click();
        }
        else {
            $("#errorAlert").show();
        }

    }

    function hideError() {
        $("#errorAlert").hide();
    }

    function doIfAlertAllHidden() {
        var allAlertHidden = true;
        allAlertHidden = $("#fNameErrorAlert").is(":hidden");
        allAlertHidden = $("#ccNumErrorAlert").is(":hidden");
        allAlertHidden = $("#ccExpErrorAlert").is(":hidden");
        allAlertHidden = $("#ccCwErrorAlert").is(":hidden");
        allAlertHidden = $("#streetNameErrorAlert").is(":hidden");
        allAlertHidden = $("#cityErrorAlert").is(":hidden");
        allAlertHidden = $("#postalCodeErrorAlert").is(":hidden");
        allAlertHidden = $("#emailErrorAlert").is(":hidden");

        if (allAlertHidden) {
            $("#errorAlert").hide();
        }
    }

</script>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<h2>Your Cart</h2>

<table class="table table-striped" data-toggle="table">
    <thead>
    <tr>
        <th>Menu Item</th>
        <th>Qty</th>
        <th>Price</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <g:each in="${shoppingCartItemList}" var="varCart">
        <tr>
            <td><strong>${varCart.itemName}</strong></td>
            <td>x ${varCart.quantity}</td>
            <td>$${varCart.convertPriceToString()}</td>
            <td class="col-md-2">
                <button class="btn-grey" type="button" name="decrement${varCart.itemName}"
                        onclick="decrementItem(${varCart.itemId})">-</button>
                <button class="btn-blue" type="button" name="increment${varCart.itemName}"
                        onclick="incrementItem(${varCart.itemId})">+</button>
            </td>
        </tr>
    </g:each>
    <tr><td colspan="4">&nbsp;</td> </tr>
    <tr>
        <td colspan="2" class="text-right">
            <strong>
                Sub-total: $<br>
                Delivery Fee: $<br>
                GST / HST: $
            </strong>
        </td>
        <td colspan="2" class="text-left">
            ${shoppingCart.findSubTotal()} <br>
            5.00 <br>
            ${shoppingCart.findTax()}
        </td>
    </tr>
    <tr>
        <td colspan="2" class="text-right text-danger">
            <strong>
                Grand Total: $
            </strong>
        </td>
        <td colspan="2" class="text-left text-danger">
            ${shoppingCart.findTotal()}
        </td>
    </tr>
    <tr>
        <td colspan="4">
            <div class="col-md-4">
                <g:link controller="home"
                        action="index"
                        class="btn btn-grey btn-block">Go Back</g:link>
            </div>
            <div class="col-md-4">
                <g:link controller="menu"
                        action="displayMenu"
                        params="[restName: restName]"
                        class="btn btn-grey btn-block">Clear</g:link>
            </div>
            <div class="col-md-4">
                <g:link controller="checkout"
                        action="index"
                        params="[shoppingCartId: shoppingCart.id, restName: restName]"
                        class="btn btn-blue btn-block">Checkout</g:link>
            </div>
        </td>
    </tr>
    </tbody>
</table>



</html>
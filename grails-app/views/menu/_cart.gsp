<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<h2>Your Cart</h2>

<table class="table table-striped" data-toggle="table">
    <tbody>
    <g:each in="${shoppingCartItemList}" var="varCart">
        <tr>
            <td><strong>${varCart.itemName}</strong></td>
            <td>x${varCart.quantity}</td>
            <td>$${varCart.convertPriceToString()}</td>
            <td class="col-md-2">
                <button class="btn-grey" type="button" name="decrement${varCart.itemName}"
                        onclick="decrementItem(${varCart.itemId})">-</button>
                <button class="btn-blue" type="button" name="increment${varCart.itemName}"
                        onclick="incrementItem(${varCart.itemId})">+</button>
            </td>
        </tr>
    </g:each>
    </tbody>
</table>

</html>
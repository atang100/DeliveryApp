package deliveryapp

import java.text.DecimalFormat

class ShoppingCart {

    double subTotal
    double tax
    double deliveryCharge
    double total

    static hasMany = [shoppingCartItems: ShoppingCartItem]

    static constraints = {
    }

    public String findSubTotal() {
        double tempTotal = 0
        for (item in shoppingCartItems) {
            tempTotal += item.quantity*item.price
        }
        tempTotal += 5 //Delivery Charge
        subTotal = tempTotal

        DecimalFormat df = new DecimalFormat("#.00")
        return df.format(tempTotal)
    }

    public String findTax() {
        findSubTotal()
        tax = subTotal*0.13
        DecimalFormat df = new DecimalFormat("#.00")
        return df.format(tax)
    }

    public String Total() {
        findTax()
        total = subTotal + tax
        DecimalFormat df = new DecimalFormat("#.00")
        return df.format(total)
    }
}

package deliveryapp

import grails.transaction.Transactional

@Transactional
class RestaurantService {

    def displayRestaurant() {
        try {
            ArrayList<Restaurant> restaurantArrayList = Restaurant.findAll()
            return restaurantArrayList
        } catch (Exception e) {

        }
    }

    def getMenuItems(String restaurantName) {
        try {
            Restaurant restaurant = Restaurant.findByRestName(restaurantName)
            ArrayList<MenuItem> menuItems = MenuItem.findAllByRestaurant(restaurant)
            return restaurant
        } catch (Exception e) {

        }
    }


}

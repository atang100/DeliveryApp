package deliveryapp

class HomeController {

    def index() {

        String userType
        if (session.user == null) {
            userType = "unregistered"
        } else {
            userType = "registered"
        }

        List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("Most Popular")
        List<Restaurant> restaurantList = Restaurant.findAll()

        render (view: "index", model: [userType: userType, mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])
    }
}

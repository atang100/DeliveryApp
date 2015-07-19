package deliveryapp

class HomeController {

    def index() {
        /**

         List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("most popular")
         List<Restaurant> restaurantList = Restaurant.findAll()

         render (view: "index", model: [mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])
         **/
        List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("most popular")
        //List<Restaurant> restaurantList = Restaurant.findAll()
        List<Restaurant> restaurantList

        switch(params.sort){
            case "restName": restaurantList = Restaurant.listOrderByRestName();
                break;
            case  "deliveryTime": restaurantList = Restaurant.listOrderByDeliveryTime();
                break;
            default: restaurantList = Restaurant.listOrderByRestName();
                break;
        }

        switch (params.order){
            case "asc": break;
            case "desc": restaurantList.reverse(true);
                break;
            default: break;
        }

        render (view: "index", model: [mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])

    }

    def trash(){
        List<Restaurant> mostPopularRestaurantList = Restaurant.findAllByCategory("most popular")
        //List<Restaurant> restaurantList = Restaurant.findAll()
        List<Restaurant> restaurantList = Restaurant.listOrderByRestName();
        //restaurantList.sort{it.restName}

        if(params.order == "asc"){
            //restaurantList.reverse()
        }
        else{
            //restaurantList.sort{it.restName}
            restaurantList.reverse(true)
        }

        render (view: "trash", model: [mostPopularRestaurantList: mostPopularRestaurantList, restaurantList: restaurantList])
    }

}

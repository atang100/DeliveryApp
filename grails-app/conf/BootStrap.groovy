import deliveryapp.Restaurant

class BootStrap {

    def init = { servletContext ->
        Restaurant restaurant1 = new Restaurant(restName: "Lucky House", category: "most popular", description: "Lucky House has been serving Canadians for the last 25 years with real authentic chinese food from China.", phoneNumber: "613-713-3434");
        restaurant1.save(failOnError: true);
        Restaurant restaurant2 = new Restaurant(restName: "The Works", category: "most popular", description: "Famous for making famous custom burgers with ridiclous ingridients. ", phoneNumber: "613-654-2851");
        restaurant2.save(failOnError: true);
        Restaurant restaurant3 = new Restaurant(restName: "Five Guys", category: "most popular", description: "Voted once of the best burgers in the world that serves fresh food.", phoneNumber: "613-836-1235");
        restaurant3.save(failOnError: true);
        Restaurant restaurant4 = new Restaurant(restName: "Montana's", category: "most popular", description: "A Canadian restaurant that is famous for in-house smoked por ribs.", phoneNumber: "613-828-3234");
        restaurant4.save(failOnError: true);
        Restaurant restaurant5 = new Restaurant(restName: "Turkish Village", category: "most popular", description: "Started by Mr.Chan, turkish village has been known to serve the best turkish food in ottawa at affordable.", phoneNumber: "613-324-3464");
        restaurant5.save(failOnError: true);
        Restaurant restaurant6 = new Restaurant(restName: "Rangoli", category: "most popular", description: "Rangoli has been around for 20 years serving the people in Ottawa amazing indian food.", phoneNumber: "613-900-7763");
        restaurant6.save(failOnError: true);
        Restaurant restaurant7 = new Restaurant(restName: "Dantessa", category: "most popular", description: "Newly open, dantessa offers a wide variety of italian food.", phoneNumber: "613-789-7712");
        restaurant7.save(failOnError: true);
        Restaurant restaurant8 = new Restaurant(restName: "Yang Tze", category: "most popular", description: "Has been around for 30 years and is in the heart of china town and offers authentic chinese food. ", phoneNumber: "613-400-3156");
        restaurant8.save(failOnError: true);
        Restaurant restaurant9 = new Restaurant(restName: "Korean Palace", category: "normal", description: "Known for our karaoke and great food.", phoneNumber: "613-424-4020");
        restaurant9.save(failOnError: true);
        Restaurant restaurant10 = new Restaurant(restName: "168 Sushi", category: "normal", description: "We offer a wide variety of sushi and is known in many cities. ", phoneNumber: "613-424-4807");
        restaurant10.save(failOnError: true);
        Restaurant restaurant11 = new Restaurant(restName: "Shawarma Palace", category: "normal", description: "The most popular shawarma restaurant in all of ottawa. Known for huge portions.", phoneNumber: "613-319-9876");
        restaurant11.save(failOnError: true);
        Restaurant restaurant12 = new Restaurant(restName: "Aiyara Thai", category: "normal", description: "Offers exsquiste food and authetic vietnamese food. ", phoneNumber: "613-219-8788");
        restaurant12.save(failOnError: true);
        Restaurant restaurant13 = new Restaurant(restName: "Red Lobster", category: "normal", description: "A chain that's known across the country that serves fresh seafood.", phoneNumber: "613-883-3113");
        restaurant13.save(failOnError: true);
        Restaurant restaurant14 = new Restaurant(restName: "Caribbean Sizzler", category: "normal", description: "Get a taste of the Caribbean here from our chefs that cook authentic food.", phoneNumber: "613-316-4156");
        restaurant14.save(failOnError: true);
        Restaurant restaurant15 = new Restaurant(restName: "iPho", category: "normal", description: "iPho has been around for 20 years and is in the byward market that serves great vietnamese food.", phoneNumber: "613-824-3102");
        restaurant15.save(failOnError: true);
        Restaurant restaurant16 = new Restaurant(restName: "Kallisto Greek", category: "normal", description: "The most prestigious greek restaurant in all of Ottawa. Known for the wraps.", phoneNumber: "613-837-1618");
        restaurant16.save(failOnError: true);
        Restaurant restaurant17 = new Restaurant(restName: "Smoque Shack", category: "nothing", description: "Voted one of the best ribs in all of Ottawa 3 times in a row. Come enjoy our BBQ food.", phoneNumber: "613-210-3174");
        restaurant17.save(failOnError: true);
        Restaurant restaurant18 = new Restaurant(restName: "Black Cat", category: "nothing", description: "Voted number one restaurant in Ottawa and a must go.", phoneNumber: "613-225-2145");
        restaurant18.save(failOnError: true);
        Restaurant restaurant19 = new Restaurant(restName: "Cacao 70", category: "nothing", description: "Your destination for dessert when you are in need of sweets.", phoneNumber: "613-456-9631");
        restaurant19.save(failOnError: true);
        Restaurant restaurant20 = new Restaurant(restName: "Ichido Ramen", category: "nothing", description: "A taste of ramen from Japan is now here in Ottawa.", phoneNumber: "613-729-7985");
        restaurant20.save(failOnError: true);
    }
    def destroy = {
    }
}

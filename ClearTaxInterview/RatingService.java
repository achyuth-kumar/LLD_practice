public class RatingService {

    RestaurantService restaurantService;
    public RatingService(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }
    public void rateRestaurant(String userId,String restId,int rating,String comment) {
       Restaurant r=restaurantService.restaurants.get(restId);
       r.ratingList.add(new Rating(userId,rating,comment));
        System.out.println("Rating updated for : Restaurant ID : "+restId+" , userID : "+userId+" :  rating : "+rating+" , Comment : "+comment);
    }

}

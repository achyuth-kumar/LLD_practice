public interface NetflixBooking {
    public boolean getAvailability(Integer userId,Integer netflixId,Integer startTime,Integer endTime);
    public void processBooking(Integer userId,Integer netflixId,Integer startTime,Integer endTime);
    public void processPayment(Integer amount);
}

public interface State {
    public void createUsers(int id, String UserName, String Password);
    public Boolean checkMovieAvailability(String name);
    public Integer getMoviePrice(String name);
    public Boolean Payment(int amount);
}
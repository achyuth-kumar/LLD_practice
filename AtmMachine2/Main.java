public class Main {
    public static void main(String [] args) {
        Operations operations=new thousandHandler();
        AtmServiceImpl atmService=new AtmServiceImpl(new hundredHandler(),new fiveHundredHandler(),new thousandHandler());
        atmService.credit(1,100);
        atmService.credit(1,200);
        atmService.viewBalance(1); //300

        atmService.debit(1,100);
        atmService.viewBalance(1); //200

    }
}

public class ATMMachine {
    public Integer amount;
    public Integer balance;
    public hundredHandler hundred=new hundredHandler();
    public fiveHundredHandler fiveHundred=new fiveHundredHandler();
    public twoThousandHandler twothousand=new twoThousandHandler();
    public  ATMMachine(Integer amt,Integer bal) {
        this.amount=amt;
        this.balance=bal;
    }
    public void processTransaction() {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else if(amount<=100) {
                hundred.amountHandler();
                System.out.println(amount+" : amount dispensed");
                balance-=amount;
                System.out.println("balance amount : "+balance);
        } else if(amount <=500) {
            fiveHundred.amountHandler();
            System.out.println(amount+" : amount dispensed");
            balance-=amount;
            System.out.println("balance amount : "+balance);
        }
        else if(amount<=2000) {
            twothousand.amountHandler();
            System.out.println(amount+" : amount dispensed");
            balance-=amount;
            System.out.println("balance amount : "+balance);
        }
    }
}

public class Main {
    public static void main(String [] args) {
        ATMMachineServiceImpl atmMachineServiceImpl=new ATMMachineServiceImpl(new HundredTransactionHandlerImpl());
        atmMachineServiceImpl.ProcessTransaction();
        atmMachineServiceImpl=new ATMMachineServiceImpl(new FiveHundredTransactionHandlerImpl());
        atmMachineServiceImpl.ProcessTransaction();
        atmMachineServiceImpl=new ATMMachineServiceImpl(new ThousandTransactionHandler());
        atmMachineServiceImpl.ProcessTransaction();
        
    }
}

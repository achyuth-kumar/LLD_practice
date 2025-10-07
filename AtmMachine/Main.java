public class Main {
    public static void main(String [] args) {
        // ATMMachineServiceImpl atmMachineServiceImpl=new ATMMachineServiceImpl(new HundredTransactionHandlerImpl(null));
        // atmMachineServiceImpl.ProcessTransaction();
        // ATMMachineServiceImpl atmMachineServiceImpl=new ATMMachineServiceImpl(new FiveHundredTransactionHandlerImpl(null));
        // atmMachineServiceImpl.ProcessTransaction();
        ATMMachineServiceImpl atmMachineServiceImpl=new ATMMachineServiceImpl(new ThousandTransactionHandler(null));
        atmMachineServiceImpl.ProcessTransaction();
        
    }
}

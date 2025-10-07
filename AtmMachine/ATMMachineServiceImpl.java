public class ATMMachineServiceImpl implements Operations {
    HundredTransactionHandlerImpl hundredTransactionHandlerImpl;
    FiveHundredTransactionHandlerImpl fiveHundredTransactionHandlerImpl;
    ThousandTransactionHandler thousandTransactionHandler;
    ATMMachineServiceImpl(HundredTransactionHandlerImpl hundredTransactionHandlerImpl) {
        this.hundredTransactionHandlerImpl=hundredTransactionHandlerImpl;
    }
    ATMMachineServiceImpl(FiveHundredTransactionHandlerImpl fiveHundredTransactionHandlerImpl) {
        this.fiveHundredTransactionHandlerImpl=fiveHundredTransactionHandlerImpl;
    }
    ATMMachineServiceImpl(ThousandTransactionHandler thousandTransactionHandler) {
        this.thousandTransactionHandler=thousandTransactionHandler;
    }
    

    @Override
    public void ProcessTransaction() {
        if(hundredTransactionHandlerImpl instanceof HundredTransactionHandlerImpl) {
            System.out.println("$Hundred handler invoked");
        }
        else if(fiveHundredTransactionHandlerImpl instanceof FiveHundredTransactionHandlerImpl) {
            System.out.println("Five Hundre handler invoked");
        }
        else if(thousandTransactionHandler instanceof ThousandTransactionHandler) {
            System.out.println("Thousand handler invoked");
        }
    }
    
}

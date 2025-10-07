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
            hundredTransactionHandlerImpl.ProcessTransaction();
        }
        else if(fiveHundredTransactionHandlerImpl instanceof FiveHundredTransactionHandlerImpl) {
            fiveHundredTransactionHandlerImpl.ProcessTransaction();
        }
        else if(thousandTransactionHandler instanceof ThousandTransactionHandler) {
            thousandTransactionHandler.ProcessTransaction();
        }
    }
    
}

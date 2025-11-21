public class redoServiceImpl implements ICommand{
    ACServiceImpl acService;

    public redoServiceImpl(ACServiceImpl acService) {
        this.acService = acService;
    }

    @Override
    public void execute() {
        acService.turnOffAc();
    }
}

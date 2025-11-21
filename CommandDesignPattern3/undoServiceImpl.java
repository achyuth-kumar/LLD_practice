public class undoServiceImpl implements ICommand{
    ACServiceImpl acService;

    public undoServiceImpl(ACServiceImpl acService) {
        this.acService = acService;
    }

    @Override
    public void execute() {
        acService.turnOnAc();
    }
}

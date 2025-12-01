public class undoServiceImpl implements ICommand{
    AirConditionerServiceImpl airConditionerService;
    undoServiceImpl() {
        airConditionerService=new AirConditionerServiceImpl();
    }

    @Override
    public void execute() {
        airConditionerService.turnOnAc();
    }
}

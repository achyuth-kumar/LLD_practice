public class undoServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public undoServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }

    @Override
    public void execute() {
        airConditionerService.turnOn();
    }
}

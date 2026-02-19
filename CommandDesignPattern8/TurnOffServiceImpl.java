public class TurnOffServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public TurnOffServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }
    @Override
    public void execute() {
        airConditionerService.turnOff();
    }

    @Override
    public void undo() {
        airConditionerService.turnOn();
    }
}

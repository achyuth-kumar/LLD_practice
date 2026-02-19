public class TurnOnServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public TurnOnServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }
    @Override
    public void execute() {
        airConditionerService.turnOn();
    }

    @Override
    public void undo() {
        airConditionerService.turnOff();
    }
}

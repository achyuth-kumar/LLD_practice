public class turnOffCommandServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public turnOffCommandServiceImpl(AirConditionerServiceImpl airConditionerService) {
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

public class turnOnCommandServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public turnOnCommandServiceImpl(AirConditionerServiceImpl airConditionerService) {
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

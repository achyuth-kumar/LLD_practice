public class turnONServiceImpl implements ICommand{

    AirConditionerServiceImpl airConditionerService;
    public turnONServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }
    @Override
    public void execute() {
        airConditionerService.turnOn();
    }
}

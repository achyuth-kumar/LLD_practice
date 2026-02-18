public class turnOFFServiceImpl implements ICommand{
    AirConditionerServiceImpl airConditionerService;
    public turnOFFServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }
    @Override
    public void execute() {
        airConditionerService.turnOff();
    }
}

public class redoServiceImpl implements ICommand{
    AirConditionerServiceImpl airConditionerService;
    public redoServiceImpl(AirConditionerServiceImpl airConditionerService) {
        this.airConditionerService = airConditionerService;
    }
    @Override
    public void execute() {
        airConditionerService.turnOff();
    }
}

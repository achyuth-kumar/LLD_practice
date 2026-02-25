public class TurnOffServiceImpl implements ICommand{


    AirConditionServiceImpl airConditionService;
    public TurnOffServiceImpl(AirConditionServiceImpl airConditionService) {
        this.airConditionService = airConditionService;
    }
    @Override
    public void execute() {
        airConditionService.turnOff();
    }

    @Override
    public void undo() {
        airConditionService.turnOn();
    }
}

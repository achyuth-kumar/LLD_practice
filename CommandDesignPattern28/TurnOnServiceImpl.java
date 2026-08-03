public class TurnOnServiceImpl implements ICommand{

    AirConditionServiceImpl airConditionService;
    public TurnOnServiceImpl(AirConditionServiceImpl airConditionService) {
        this.airConditionService = airConditionService;
    }

    @Override
    public void execute() {
        airConditionService.turnOn();
    }

    @Override
    public void undo() {
        airConditionService.turnOff();
    }
}

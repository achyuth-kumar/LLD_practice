public class redoServiceImpl implements ICommand{
    AirConditionerServiceImpl airConditionerService;
    redoServiceImpl() {
        airConditionerService=new AirConditionerServiceImpl();
    }

    @Override
    public void execute() {
        airConditionerService.turnOffAc();
    }
}

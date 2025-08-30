public class VisitImpl implements IVisit{

    @Override
    public void visit(String type) {
        System.out.println(type+" room visited");
    }
}

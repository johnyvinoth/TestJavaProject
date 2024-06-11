package AdaptorPattern;

public class AdaptorPatternImpl
{

public static void main(String[] args)
{

//    Pen pen =new PenAdaptor();
    Pen pilotPenAdaptor = new PenAdaptor(new PilotPen());
    Pen gelPenAdaptor= new PenAdaptor(new GelPen());

    AssignmentWork aw1 = new AssignmentWork();
    AssignmentWork aw2 = new AssignmentWork();
    aw1.setPen(pilotPenAdaptor);
    aw1.writeAssignment("I dont want to write assignment");

    aw2.setPen(gelPenAdaptor);
    aw2.writeAssignment("I dont want to write assignment");
}



}

package AdaptorPattern;

public class PenAdaptor implements Pen
{
//       PilotPen pp=new PilotPen();
private PilotPen pilotPen;
private GelPen gelPen;


    public PenAdaptor(PilotPen pilotPen) {
        this.pilotPen = pilotPen;
    }

    public PenAdaptor(GelPen gelPen) {
        this.gelPen = gelPen;
    }

    @Override
    public void write(String str) {
        if(pilotPen !=null)
        {
            pilotPen.mark(str);
        } else if (gelPen !=null)
        {
        gelPen.mark(str);
        }
//        pp.mark(str);
    }
}

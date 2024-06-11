package InhertancePattern;



public class DocumentNameCreator extends  AbstractDocumentCounter
{
  private String prefix;

  public DocumentNameCreator(int increment, String prefix)
  {
    super (increment);
    this.prefix = prefix;
  }

    public DocumentNameCreator(int increment) {
        super(increment);
    }



//  class2 c2= new class();

//  public String getNewDocumentName ()
//  {
//      c2.getNewDocumentName1(prefix);
//  }
//
//


   public String getNewDocumentName ()
   {
     return prefix + getAndIncrement ();
   }

}


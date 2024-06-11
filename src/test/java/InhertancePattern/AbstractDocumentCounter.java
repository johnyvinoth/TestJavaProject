package CompositPattern;// Refactor the AbstractDocumentCounter and DocumentNameCreator classes
// so that they use composition rather than inheritance 
// but their functionality remains the same.



public abstract class AbstractDocumentCounter
{
    private int count = 0;
    private int increment;

    public AbstractDocumentCounter (int increment)
    {
        this.increment = increment;
    }

    protected int getAndIncrement ()
    {
        this.count += this.increment;
        return this.count;
    }

    public abstract String getNewDocumentName ();
}
//public class class2 extends AbstractDocumentCounter
//{
// public String getNewDocumentName1 (String prefix)
//  {
//    return prefix + getAndIncrement ();
//  }
//}




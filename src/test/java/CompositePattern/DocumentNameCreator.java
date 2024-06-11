package CompositePattern;


public class DocumentNameCreator implements DocumentCounter {
   private AbstractDocumentCounter counter;
    private String prefix;

    public DocumentNameCreator(int increment, String prefix) {
        this.counter=new AbstractDocumentCounter(increment);
        this.prefix = prefix;
    }



    @Override
    public String getNewDocumentName() {
        return prefix + counter.getAndIncrement();
    }

}


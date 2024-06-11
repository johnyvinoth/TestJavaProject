package InhertancePattern;

public class CompositePatternImplementation {

    public static void main(String[] args) {
        DocumentNameCreator docCreator = new DocumentNameCreator(2, "temp");
        System.out.println(docCreator.getNewDocumentName());

    }
}

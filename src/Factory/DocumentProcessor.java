package Factory;

public class DocumentProcessor {

    public void processDocuments() {
        System.out.println("Factory Method Pattern Demo - Document Processing System");
        System.out.println("========================================================");

        DocumentCreator[] creators = {
                new PDFDocumentCreator(),
                new WordDocumentCreator(),
                new ExcelDocumentCreator()
        };

        for (DocumentCreator creator : creators) {
            creator.processDocument();
            creator.validateDocument();
            System.out.println();
        }
    }
}
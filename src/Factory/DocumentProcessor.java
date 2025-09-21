package Factory;

public class DocumentProcessor {

    public void processDocuments() {
        System.out.println("Factory Method Pattern Demo - Document Processing System");
        System.out.println("========================================================");

        // Array of different creators
        DocumentCreator[] creators = {
                new PDFDocumentCreator(),
                new WordDocumentCreator(),
                new ExcelDocumentCreator()
        };

        // Process each document type
        for (DocumentCreator creator : creators) {
            creator.processDocument();
            creator.validateDocument();
            System.out.println();
        }
    }
}
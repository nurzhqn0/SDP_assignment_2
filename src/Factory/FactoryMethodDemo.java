package Factory;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        DocumentProcessor processor = new DocumentProcessor();
        processor.processDocuments();

        // Additional demonstration: runtime document type selection
        System.out.println("\n=== Runtime Document Type Selection ===");

        String[] documentTypes = {"PDF", "WORD", "EXCEL"};

        for (String type : documentTypes) {
            DocumentCreator creator = getDocumentCreator(type);
            if (creator != null) {
                creator.processDocument();
            } else {
                System.err.println("Unsupported document type: " + type);
            }
        }
    }

    // Factory method for selecting creator based on string input
    private static DocumentCreator getDocumentCreator(String type) {
        switch (type.toUpperCase()) {
            case "PDF":
                return new PDFDocumentCreator();
            case "WORD":
                return new WordDocumentCreator();
            case "EXCEL":
                return new ExcelDocumentCreator();
            default:
                return null;
        }
    }
}

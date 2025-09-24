package Factory;

public class FactoryMethodDemo {

    public static void main(String[] args) {
        DocumentProcessor processor = new DocumentProcessor();
        processor.processDocuments();

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

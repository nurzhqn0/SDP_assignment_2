package Factory;

public class ExcelDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        System.out.println("Excel Creator: Initializing spreadsheet calculation engine");
        return new ExcelDocument();
    }
}



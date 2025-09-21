package Factory;

public class PDFDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        System.out.println("PDF Creator: Initializing PDF generation engine");
        return new PDFDocument();
    }
}
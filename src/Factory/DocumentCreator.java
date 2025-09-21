package Factory;

public abstract class DocumentCreator {
    public abstract Document createDocument();

    public final void processDocument() {
        System.out.println("\n=== Starting Document Processing ===");

        // Use factory method to create the product
        Document document = createDocument();

        System.out.println("Processing: " + document.getType());
        document.create();
        document.format();
        document.save();

        System.out.println("Document processing completed successfully!");
        System.out.println("=====================================");
    }

    // Additional business logic
    public void validateDocument() {
        Document document = createDocument();
        System.out.println("Validating " + document.getType() + " structure and content");
    }
}

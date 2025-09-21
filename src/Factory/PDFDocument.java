package Factory;

public class PDFDocument extends Document {
    @Override
    public void create() {
        System.out.println("Creating PDF document with advanced formatting capabilities");
        System.out.println("Setting up PDF metadata and compression settings");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document with embedded fonts and images");
    }

    @Override
    public void format() {
        System.out.println("Applying PDF-specific formatting: vector graphics and scalable text");
    }

    @Override
    public String getType() {
        return "PDF Document";
    }
}

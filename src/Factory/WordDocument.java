package Factory;

public class WordDocument extends Document {
    @Override
    public void create() {
        System.out.println("Creating Word document with rich text formatting");
        System.out.println("Initializing spell checker and grammar tools");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document with revision tracking enabled");
    }

    @Override
    public void format() {
        System.out.println("Applying Word formatting: styles, headers, and page layout");
    }

    @Override
    public String getType() {
        return "Word Document";
    }
}

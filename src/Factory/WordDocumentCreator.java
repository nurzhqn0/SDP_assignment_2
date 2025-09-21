package Factory;

public class WordDocumentCreator extends DocumentCreator {
    @Override
    public Document createDocument() {
        System.out.println("Word Creator: Loading Microsoft Word templates");
        return new WordDocument();
    }
}

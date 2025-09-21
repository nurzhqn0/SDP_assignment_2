package Factory;

public abstract class Document {
    public abstract void create();
    public abstract void save();
    public abstract void format();
    public abstract String getType();
}
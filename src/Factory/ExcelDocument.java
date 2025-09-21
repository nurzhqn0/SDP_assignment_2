package Factory;

public class ExcelDocument extends Document {
    @Override
    public void create() {
        System.out.println("Creating Excel spreadsheet with calculation engine");
        System.out.println("Setting up formulas and data validation rules");
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document with data integrity checks");
    }

    @Override
    public void format() {
        System.out.println("Applying Excel formatting: cell styles, charts, and pivot tables");
    }

    @Override
    public String getType() {
        return "Excel Document";
    }
}

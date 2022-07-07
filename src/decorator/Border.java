package decorator;

public class Border extends Display {
    protected final Display display;

    public Border(Display display) {
        this.display = display;
    }

    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowText(int row) {
        return null;
    }
}

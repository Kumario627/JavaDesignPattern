package adapter.extend;

/**
 * AdapterのAdaptee（適合される側）
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + this.string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + this.string + "*");
    }
}

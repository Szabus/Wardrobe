package clothes;

public class Stockings  extends ClothesElement {

    private String type;

    public Stockings() {
    }

    public Stockings(String name, String whoWears, int status, String type) {
        super(name, whoWears, status);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

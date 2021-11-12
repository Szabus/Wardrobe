package clothes;

public class Coat extends ClothesElement {

    private String type;

    public Coat() {
    }

    public Coat(String name, String whoWears, int status, String type) {
        super(name, whoWears, status);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

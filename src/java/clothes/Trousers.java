package clothes;

public class Trousers extends ClothesElement {

    private String length;


    public Trousers() {
    }

    public Trousers(String name, String whoWears, int status, String length) {
        super(name, whoWears, status);
        this.length = length;
    }

    public String getLength() {
        return length;
    }
}

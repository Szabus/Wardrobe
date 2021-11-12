package clothes;

public class Shoes extends ClothesElement{

    private int size;

    public Shoes() {
    }

    public Shoes(String name, String whoWears, int status, int size) {
        super(name, whoWears, status);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

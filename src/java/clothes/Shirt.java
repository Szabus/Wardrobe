package clothes;

public class Shirt extends ClothesElement {

    private boolean isLongSleeved;



    public Shirt() {
    }

    public Shirt(String name, String whoWears, int status, boolean isLongSleeved) {
        super(name, whoWears, status);
        this.isLongSleeved = isLongSleeved;
    }

    public boolean isLongSleeved() {
        return isLongSleeved;
    }
}

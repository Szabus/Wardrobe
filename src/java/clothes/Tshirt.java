package clothes;

public class Tshirt  extends ClothesElement {

    private String colour;
    private boolean isPatterned;



    public Tshirt() {
    }

    public Tshirt(String name, String whoWears, int status, String colour, boolean isPatterned) {
        super(name, whoWears, status);
        this.colour = colour;
        this.isPatterned = isPatterned;
    }

    public String getColour() {
        return colour;
    }

    public boolean isPatterned() {
        return isPatterned;
    }
}

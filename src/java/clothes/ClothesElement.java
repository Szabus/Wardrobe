package clothes;

public class ClothesElement {

    // Ruhaneműk ősosztálya, közös tulajdonságokkal.

    protected String name;
    protected String whoWears = "unknown";
    protected int status = 0;
    protected int number;

    protected static int remainingClothes = 0;
    protected static int charityClothes = 0;
    protected static int trashClothes = 0;


    public int getNumber() {
        return number;
    }

    public ClothesElement(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public ClothesElement() {
    }

    public ClothesElement(String name, String whoWears, int status) {
        this.name = name;
        this.whoWears = whoWears;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getWhoWears() {
        return whoWears;
    }

    public int getStatus() {
        return status;
    }
    
    public void sortedClothesCounter(){

    }
}

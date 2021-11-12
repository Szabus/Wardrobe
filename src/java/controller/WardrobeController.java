package controller;

import clothes.*;
import utils.DocReader;

import java.util.ArrayList;
import java.util.List;

public class WardrobeController {

    private List<String> allClothesList = new ArrayList<>();
    private int allClothesNumber = allClothesList.size();

    public List<Tshirt> tshirtList = new ArrayList<>();
    public List<Trousers> trousersList = new ArrayList<>();
    public List<Stockings> stockingsList = new ArrayList<>();
    public List<Shoes> shoesList = new ArrayList<>();
    public List<Shirt> shirtList = new ArrayList<>();
    public List<Coat> coatList = new ArrayList<>();

    public List<ClothesElement> wardrobe = new ArrayList<>();

    public List<ClothesElement> clothesStorage = new ArrayList<>();

    public Integer t_shirNumbers = 0;


    public WardrobeController() {
        loadList();
        separateAllClothes();
        System.out.println("Clothes storage size: " + clothesStorage.size());
        System.out.println("Storage type: " + clothesStorage.get(0).getName());
        System.out.println("Tshirt numbers: " + clothesStorage.get(0).getNumber());

    }

    public void loadList() {
        DocReader docReader = new DocReader();
        allClothesList = docReader.allClothes;
    }

    // A létrehozott String listát feldarabolom és if-et használva, fajtánként új listákat hozok létre.

    public void separateClothes() {
        for (int i = 0; i < allClothesList.size(); i++) {
            String[] parts = allClothesList.get(i).split(",");
            if (parts[0].equals("póló")) {
                tshirtList.add(new Tshirt(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Boolean.parseBoolean(parts[4])));
            } else if (parts[0].equals("ing")) {
                shirtList.add(new Shirt(parts[0], parts[1], Integer.parseInt(parts[2]), Boolean.parseBoolean(parts[3])));
            } else if (parts[0].equals("nadrág")) {
                trousersList.add(new Trousers(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else if (parts[0].equals("kabát")) {
                coatList.add(new Coat(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else if (parts[0].equals("cipő")) {
                shoesList.add(new Shoes(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            } else if (parts[0].equals("zokni")) {
                stockingsList.add(new Stockings(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else {
                System.out.println("Expression do not found");
            }
        }
    }

    //A beolvasott String lista soronkénti elemeit feldarabolom, és így létrehozok egy közös, ClothesElement típusú
    // listát, az egyes elemekből.
    private void separateAllClothes() {
        for (int i = 0; i < allClothesList.size(); i++) {
            String[] parts = allClothesList.get(i).split(",");
            if (parts[0].equals("póló")) {
                wardrobe.add(new Tshirt(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], Boolean.parseBoolean(parts[4])));
            } else if (parts[0].equals("ing")) {
                wardrobe.add(new Shirt(parts[0], parts[1], Integer.parseInt(parts[2]), Boolean.parseBoolean(parts[3])));
            } else if (parts[0].equals("nadrág")) {
                wardrobe.add(new Trousers(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else if (parts[0].equals("kabát")) {
                wardrobe.add(new Coat(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else if (parts[0].equals("cipő")) {
                wardrobe.add(new Shoes(parts[0], parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3])));
            } else if (parts[0].equals("zokni")) {
                wardrobe.add(new Stockings(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3]));
            } else {
                System.out.println("Expression do not found");
            }
        }
    }
}

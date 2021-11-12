package controller;

import clothes.*;

import java.util.ArrayList;
import java.util.List;

public class SortController {

    private List<Tshirt> tshirtList;
    private List<Trousers> trousersList;
    private List<Stockings> stockingsList;
    private List<Shoes> shoesList;
    private List<Shirt> shirtList;
    private List<Coat> coatList;

    private List<ClothesElement> wardrobe = new ArrayList<>();

    private List<ClothesElement> remainingClothes = new ArrayList<>();
    private List<ClothesElement> giveawayClothes = new ArrayList<>();
    private List<ClothesElement> trashClothes = new ArrayList<>();


    private int remainingClothesCounter= remainingClothes.size();
    private int giveawayClothesCounter=giveawayClothes.size();
    private int trashClothesCounter= trashClothes.size();


    public SortController() {
       // getListsOfClothes();
        getWardrobeList();
        sortAllClothes();
    }

    public void getListsOfClothes() {
        WardrobeController wardrobeController = new WardrobeController();
        tshirtList = wardrobeController.tshirtList;
        trousersList = wardrobeController.trousersList;
        stockingsList = wardrobeController.stockingsList;
        shirtList = wardrobeController.shirtList;
        shoesList = wardrobeController.shoesList;
        coatList = wardrobeController.coatList;

    }

    // Példányosítom a wardrobecontrollert és meghívom az elkészítet közös listát.
    public void getWardrobeList(){
        WardrobeController wardrobeController = new WardrobeController();
        wardrobe = wardrobeController.wardrobe;
    }

    private void sortingClothes() {
        for (int i = 0; i < tshirtList.size(); i++) {
            if (tshirtList.get(i).getStatus() < 3) {
                remainingClothes.add(tshirtList.get(i));
                remainingClothesCounter++;
            } else if(tshirtList.get(i).getStatus()==3||tshirtList.get(i).getStatus()==4){
                giveawayClothes.add(tshirtList.get(i));
                giveawayClothesCounter++;
            } else if(tshirtList.get(i).getStatus()==5){
                trashClothes.add(tshirtList.get(i));
                trashClothesCounter++;
            } else{
                System.out.println("Error");
            }
        }
    }

    // A közös, wardrobe lista status elemeit szortírozom és külön szedem.

    public void sortAllClothes(){
        for (int i = 0; i < wardrobe.size(); i++) {
            if (wardrobe.get(i).getStatus() < 3) {
                remainingClothes.add(wardrobe.get(i));
                remainingClothesCounter++;

                //egy counter, ami fajtánként számol
                //if wardrobe.get(i).getName().equals("póló")->számláló
            } else if(wardrobe.get(i).getStatus()==3||wardrobe.get(i).getStatus()==4){
                giveawayClothes.add(wardrobe.get(i));
                giveawayClothesCounter++;
            } else if(wardrobe.get(i).getStatus()==5){
                trashClothes.add(wardrobe.get(i));
                trashClothesCounter++;
            } else{
                System.out.println("Error");
            }
        }
    }

    public void sortByType(){

        for (int i = 0; i < remainingClothes.size(); i++){
            if (remainingClothes.get(i).getName().equals("póló")){

            }
        }

    }

}

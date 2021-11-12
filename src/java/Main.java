import clothes.Coat;
import controller.WardrobeController;
import utils.DocReader;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        //Coat ballonCoat = new Coat("ballon","women",5,"őszi");

        //System.out.println(ballonCoat.getName());

        WardrobeController wardrobeController = new WardrobeController();
        wardrobeController.loadList();

        wardrobeController.separateClothes();

        /*DocReader docReader = new DocReader();
        docReader.loadClothesToList(DocReader.SOURCE_CLOTHES);*/
    }
}

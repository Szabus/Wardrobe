package utils;

import clothes.ClothesElement;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DocReader {

    // Beolvasom a clothes.txt és egy String listába teszem.

    private static final String SOURCE_DIR = "src/resources/";
    public static final String SOURCE_CLOTHES = SOURCE_DIR + "clothes.txt";

    public List<String> allClothes = new ArrayList<>();

    public DocReader() {
        loadAllData();
    }

    private void loadAllData() {
        try {
            loadClothesToList(SOURCE_CLOTHES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void loadClothesToList(String fileName) throws IOException {
        BufferedReader bufferedReader = loadFileFromBufferedReader(fileName);
        for (String line; (line = bufferedReader.readLine()) != null;) {
            allClothes.add(line);
        }
       // System.out.println(allClothes);
    }

    private BufferedReader loadFileFromBufferedReader(String fileName) throws FileNotFoundException {
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        return bufferedReader;
    }

}

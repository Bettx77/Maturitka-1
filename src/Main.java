import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\betty\\Documents\\GitHub\\Maturitka 1\\src\\input.txt";

        ArrayList<int[]> poles = new ArrayList<>();
        MaturitkaMatice input = null;

        // import data from file
        try  {
            input = new MaturitkaMatice(filePath);
            int[] pole;
            while ((pole = input.rowInput()) != null) {
                poles.add(pole);
            }
        } catch (IOException e) {
            System.err.println("Chyba při práci se souborem: " + e.getMessage());
        }

        // creating matrix
        int matrixSize = poles.size();
        //System.out.println(matrixSize);

        ArrayList<int[]> newTriangleMatrix = new ArrayList<>();
        newTriangleMatrix = MaturitkaMatice.triangleMatrix(matrixSize, poles);

        //print
        for (int i = 0; i < matrixSize; i++){
            System.out.println(Arrays.toString(newTriangleMatrix.get(i)));
        }


        // ukol 1
        String rawString = MaturitkaString.rowInput();
        String[] arrayString = rawString.split(" ");
        // System.out.println(Arrays.toString(arrayString));
        System.out.println();

        MaturitkaString.matchWords(rawString);

        // nejdelší String
        int maxLenght = 0;
        for (String word : arrayString) {
            if (word.length() > maxLenght) {
                maxLenght = word.length();
            }
        }
        System.out.println("\n" + maxLenght);

        // ukol 3
        int x_value = 4;
        int n_value = 6;

        System.out.println(MaturitkaRekurze.legendr(n_value, x_value));
    }
}
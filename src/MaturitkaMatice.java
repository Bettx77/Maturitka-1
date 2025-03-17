import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class MaturitkaMatice {

    private BufferedReader reader;

    public MaturitkaMatice(String filePath) throws IOException {
        reader = new BufferedReader(new FileReader(filePath));
    }

    public int[] rowInput() {
        try {
            String row = reader.readLine();
            if (row == null || row.isEmpty()) {
                return null;
            }

            // Rozdělení řádku na čísla
            String[] cislaJakoStringy = row.trim().split("\\s+");
            return Arrays.stream(cislaJakoStringy)
                    .mapToInt(Integer::parseInt)
                    .toArray();
        } catch (IOException | NumberFormatException e) {
            System.err.println("Chyba při čtení řádku: " + e.getMessage());
        }
        return null;
    }

    // create triangle matrix
    public static ArrayList<int[]> triangleMatrix(int size, ArrayList<int[]> matrix) {
        ArrayList<int[]> triangleMatrix = new ArrayList<>();

        for (int j = 0; j < size; j++) {
            int[] newLine = new int[size+j];
            for (int k = 0; k < size+j; k++) {
                newLine[k] = matrix.get(j)[k%(size)];
            }
            triangleMatrix.add(newLine);
        }

    return triangleMatrix;
    }
}
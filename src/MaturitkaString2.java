import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaturitkaString2 {
    public static void main(String[] args) throws IOException {
        // Check if the file exists
        File file = new File("C:\\Users\\betty\\Documents\\GitHub\\Maturitka 1\\src\\inputString.txt");

        // Read and process each line of the file
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String buffer;
            while ((buffer = reader.readLine()) != null) {
                // Use regex to find words starting with an uppercase letter
                matchWords(buffer);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    private static void matchWords(String line) throws IOException {
        String pattern = "\\b[A-Z]\\w*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(line);

        while (m.find()) {
            if (m.group() != null) {
                System.out.print(m.group() + " ");
            }
        }
    }
}

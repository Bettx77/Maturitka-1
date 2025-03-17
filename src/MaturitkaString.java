import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MaturitkaString {

    public static String rowInput() {
        try {
            String filePath = "C:\\Users\\betty\\Documents\\GitHub\\Maturitka 1\\src\\inputString.txt";
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            return content;

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void matchWords(String line) throws IOException {
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


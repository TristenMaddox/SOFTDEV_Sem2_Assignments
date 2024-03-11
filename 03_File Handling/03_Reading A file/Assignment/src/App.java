import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/SampleText16LE.txt";

        FileReader fileReader = new FileReader(fileName);
        BufferedReader reader = new BufferedReader(fileReader);
        System.out.println(reader.readLine());
        System.out.println(reader.read());

        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(
        fileInputStream, "UTF-16BE");
        BufferedReader reader = new BufferedReader(inputStreamReader);

        System.out.println(reader.readLine());
        reader.close();

        Path filePath = Paths.get(fileName);
        List<String> lines = Files.readAllLines(filePath);

        for (let i = 0; i < Lines.length; i++) {
            text += Lines[i] + "Lines inn the file";
          }
    }
    System.out.println();
}
package FilesPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\OWNER\\MyMainProjects\\";
        String fileName = "transactions.json";
        String location = filePath.concat(fileName);

        try (FileInputStream outputStream = new FileInputStream(location)) {
            outputStream.readAllBytes();
            System.out.println(outputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

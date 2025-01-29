package FilesInputStram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCreate {

    public static void main(String[] args) {
        String locator = "C:\\Users\\OWNER\\Desktop";
        String fileName = "myname.txt";
        Path fileLocation = Path.of(locator, fileName);

        try {
            Files.createFile(fileLocation);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         try {
             System.out.println(Files.size(fileLocation));
         } catch (IOException e) {
             throw new RuntimeException(e.getMessage());
         }

        try {
            System.out.println(Files.getOwner(fileLocation));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}

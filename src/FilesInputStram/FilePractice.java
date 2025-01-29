package FilesInputStram;

import BuilderPattern.Dog;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class FilePractice {

    public static void main(String[] args) {
        String files = "C:\\Users\\OWNER\\Desktop\\";
        String locator = files.concat("myname.txt");


        try (FileInputStream fileInputStream = new FileInputStream(locator)){
            byte[] data = fileInputStream.readAllBytes();
            System.out.println(new String(data));
        }catch (IOException e){
            e.printStackTrace();
        }

        try (ObjectOutputStream outputStream = new ObjectOutputStream(System.out)){
            Dog dog = new Dog("David",12);
            outputStream.writeObject(dog);
            System.out.println(outputStream);
        }catch (IOException e){
            e.printStackTrace();
            System.err.println("Error writing cat to destination with ms: "+e.getMessage());
        }

    }
}

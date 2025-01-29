package FilesInputStram;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.nio.file.Path;

public class Deserialization {

    public static void main(String[] args) {
        String filepath = "C:\\Users\\OWNER\\MyMainProjects\\";
        String filename = "Photos.json";
        Path paths = Path.of(filepath, filename);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);

        try (FileInputStream inputStream = new FileInputStream(paths.toString())) {
            if (paths.toFile().getTotalSpace() % 2 == 0) {
                System.out.println(new String(inputStream.readAllBytes()));
            } else {
                System.out.println("Error reading from Json file " + paths.getFileName());
            }
            //System.out.println(Arrays.toString(inputStream.readAllBytes()));
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }



}

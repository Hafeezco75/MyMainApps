package FilesInputStram;

import BuilderPattern.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.FileInputStream;
import java.io.IOException;

public class Jackson {

    public static void main(String[] args) {
        String filename = "C:\\Users\\OWNER\\MyMainProjects\\Task.json";
        Dog dog = new Dog("Bulldog", 17);
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

//        try {
//            String json = mapper.writeValueAsString(dog);
//            System.out.println(json);
//       }catch (IOException e){
//            System.err.println(e.getMessage());
//        }
//
//        try (FileWriter fileWriter = new FileWriter("Task.json")){
//            fileWriter.write(mapper.enable(SerializationFeature.INDENT_OUTPUT).writeValueAsString(dog));
//        }catch (IOException e){
//            e.printStackTrace();
//            System.err.println("Error while writing to file" + e.getMessage());
//        }

        try (FileInputStream fileStream = new FileInputStream(filename)){
            mapper.readValue(fileStream, Dog.class);
            System.out.println("name: " + dog.getName() + "\n" + "age:" + dog.getAge());
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

package FilesInputStram;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;

@JsonDeserialize(using = LocalDateDeserializer.class)
public class  Deserializations {

    public static void main(String[] args) {
        String serialize = "C:\\Users\\OWNER\\MyMainProjects\\";
        String filename = "transactions.json";
        Path check = Path.of(serialize,filename);

        try (FileInputStream stream = new FileInputStream(check.toFile())){
            Transacts transacts = new Transacts(2,"John","Daniel",new BigDecimal("100.00"), LocalDate.now());
            stream.read();
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}

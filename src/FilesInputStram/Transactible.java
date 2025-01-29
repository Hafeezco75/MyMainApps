package FilesInputStram;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transactible {

    public static void main(String[] args) {

        List<Transaction> transact = new ArrayList<>();
        Transaction transaction = new Transaction(1,"Ds143as",new BigDecimal("143.00"),LocalDate.now());
        Transaction transaction1 = new Transaction(2,"Bass143as",new BigDecimal("140.67"),LocalDate.of(2021,4,18));
        Transaction transaction2 = new Transaction(3,"JF54SAC251",new BigDecimal("290.00"),LocalDate.of(2023,6,21));
        Transaction transaction3 = new Transaction(4,"FCa543sv",new BigDecimal("620.00"),LocalDate.of(2023,9,17));
        transact.add(transaction);
        transact.add(transaction1);
        transact.add(transaction2);
        transact.add(transaction3);

        transactions(transact);
    }

    private static void transactions(List<Transaction> list) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    String filepath = "C:\\Users\\OWNER\\MyMainProjects\\src\\FilesInputStram\\";
    Path path = Path.of(filepath, "Transactionss.json");

        try (FileOutputStream inputStream = new FileOutputStream("Transactionss.json")) {
            inputStream.write(mapper.writeValueAsString(list).getBytes());
            System.out.println(inputStream);
        }catch (IOException e){
        System.out.println(e.getMessage());
        }
    }

}
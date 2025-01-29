package FileInputStream;

import FilesInputStram.Deserializations;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeserializationTest {

    @Test
    public void testThatTransactionsCanBeDeserialized() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY);
        Deserializations deserialize = new Deserializations();
        JSONPObject jsonpObject = new JSONPObject("transactible", deserialize);
        assertEquals();


    }

}

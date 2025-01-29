import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamPractice {

    List<Integer> number = new ArrayList<Integer>();

    public static void main(String[] args) {


        int[] arr = {2,4,6,8,10};

        var sort = Arrays.stream(arr);

        System.out.println(Arrays.toString(sort.map(operand -> arr[2]).toArray())   );


    }
}

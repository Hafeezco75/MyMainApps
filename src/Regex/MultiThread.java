package Regex;

import static java.lang.Thread.currentThread;

public class MultiThread {

    String p1 = "from plant";
    String p2 = "to animal";

    public static String begin(){
        for (int count = 0; count < 20; count++){
            count++;
        }
        return currentThread().getName();
    }
}

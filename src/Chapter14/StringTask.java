package Chapter14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTask {

    public static void main(String[] args) {
        System.out.println(doubleCheck(new StringBuilder("Commmee")));
    }

    public static boolean containAlphabet(){
        Pattern patterns = Pattern.compile("[a-zA-Z]");
        Matcher matchs = patterns.matcher("abaf");

        if (matchs.find()) {
            return true;
        }else {
            return false;
        }
    }

    public static String doubleCheck(StringBuilder strings){
        Pattern value = Pattern.compile("Committee");

        Matcher matcher = value.matcher("Commmeee");

        if (matcher.appendReplacement(strings, "Commmeee").toString().equals(value.toString())) {
            return value.pattern();
        }else {
            return matcher.replaceFirst("");
        }



   }


}

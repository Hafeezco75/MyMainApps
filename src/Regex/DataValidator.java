package Regex;

public class DataValidator {

    public static void main(String[] args) {

    }

    public static boolean validate(String email) {
        String regex = "([a-zA-Z]|[0-9]|[`~!#%*:'<>.]{0})+@([A-Za-z])\\.([A-Za-z])";
        return email.matches(regex);
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String regex = "([0-9]{1,3})+\\|([0-9]{1,3})-([0-9]{1,4})";
        return phoneNumber.matches(regex);
    }

    //(123) 456-7890
}

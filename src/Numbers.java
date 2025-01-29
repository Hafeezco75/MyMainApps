public class Numbers {

    public static void main(String[] args) {
        int count;
        int counter;

//        for (count = 0; count < 8; count++) {
//            System.out.println();
//
//
//            for (counter = 1; counter <= count; counter++) {
//                System.out.printf(String.valueOf(counter) + "");
//            }
//        }
//
//        for (count = 8; count > 0; count--) {
//            System.out.println("");
//
//            for (counter = 1; counter <= count; counter++) {
//                System.out.printf(String.valueOf(counter) + "");
//            }
//        }

        for (counter = 1; counter <= 5; counter++) {
            System.out.print("");

        }
            for (counter = 5; counter > 1; counter--) {
                System.out.println();

                for (count = 1; count <= counter; count++) {
                    System.out.printf(count + " ");
                }
            }


    }
}


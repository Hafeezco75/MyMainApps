public class Circle {

    public void method1() {
        Circle c = new Circle();
        int Area = 5 + c.getRadius();
        System.out.println("What is radius " + Area);


    }

    private int getRadius() {
        return 10;
    }
}

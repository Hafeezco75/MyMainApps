package BuilderPattern;

public class Example1 {
    private Dog dog;

    public Example1(Dog dog) {
        this.dog = dog;
    }

    public static void main(String[] args) {
        Dog.Builder build = new Dog.Builder();
                    build.dog.setAge(10);
                    build.dog.setName("Dog");
                    build.dog.setHeight(12);
                    build.dog.setSize("Large");


        System.out.println(build);
    }


}

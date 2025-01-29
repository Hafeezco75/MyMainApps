package BuilderPattern;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private int age;
    private String size;
    private int height;

    public Dog(){
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", height=" + height +
                '}';
    }

    public static class Builder{
        Dog dog = new Dog();

        public int Builders(Dog dog){
            return this.dog.age;
        }

        public String Build(Dog dog){
            return this.dog.name;
        }

        public String Build(){
            return this.dog.size;
        }

        public int Builds(Dog dog){
            return this.dog.height;
        }
    }


}

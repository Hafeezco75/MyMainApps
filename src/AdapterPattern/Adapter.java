package AdapterPattern;

public class Adapter implements ITarget {
    private Adaptee adaptee;


    @Override
    public void request() {

        this.adaptee.specificRequest();
    }

    public Adapter (Adaptee a) {

        this.adaptee = a;
    }

}

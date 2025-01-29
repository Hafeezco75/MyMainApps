package ArraylistsBuild;

public interface MyLists {

    void add(String element);

    void remove(String element);

    void clear();

    void remove(int index);

    int capacity();

    int size();

    boolean isEmpty();

    boolean contains(String element);

    String get(int index);

}

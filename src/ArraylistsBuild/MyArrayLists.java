package ArraylistsBuild;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayLists implements MyLists {
    private String[] lists = new String[3];
    private int size;


    public MyArrayLists() {
    }

    @Override
    public void add(String element) {
        for (int count = 0; count < lists.length; count++) {
            if (lists[count] == null) {
                lists[count] = element;
            }
        }
    }

    @Override
    public void remove(String element) {
        for (String list : lists) {

        }
    }

    @Override
    public void clear() {

    }

    private int findIndex(String element) {
        for (int count = 0; count < lists.length; count++) {
            if (lists[count].equals(element)) {
                return count;
            }
        }
        return size--;
    }

    @Override
    public void remove(int index) {
        for (int count = 0; count < lists.length; count++) {
            findIndex(String.valueOf(index));
        }
    }

    @Override
    public int capacity() {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(String element) {
        return false;
    }

    @Override
    public String get(int index) {
        return this.lists[index];
    }
}

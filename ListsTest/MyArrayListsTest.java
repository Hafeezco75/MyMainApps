import ArraylistsBuild.MyArrayLists;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListsTest {

    @Test
    void testThatElementsCanBeAddedToArrayList() {
        MyArrayLists check = new MyArrayLists();
        check.add("F-Strings");
        assertEquals("F-Strings", check.get(0));
    }

    @Test
    void testThatElementsCanBeRemovedFromArrayList() {
        MyArrayLists check = new MyArrayLists();
        check.add("F-Strings");
        check.remove("F-Strings");
        assertEquals(null, check.get(0));
    }

    @Test
    void testThatItemsCanBeClearedFromList() {
        MyArrayLists check = new MyArrayLists();
        check.add("F-Strings");
    }

    @Test
    void testThatItemsCanBeRemovedByIndex() {
    }

    @Test
    void capacity() {
    }

    @Test
    void size() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void contains() {
    }

    @Test
    void get() {
    }
}
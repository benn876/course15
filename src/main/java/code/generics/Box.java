package code.generics;

import java.util.List;

public class Box<T> {
    private T item;
    private List<T> listItems;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

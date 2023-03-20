package code.generics;

import homework.person.Person;

import java.util.List;

public class BoxNumbers<T extends Number> {
    private T item;

    public BoxNumbers(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public <E extends Person> int getLengthOfName(E item) {
        return item.name().length();
    }
}

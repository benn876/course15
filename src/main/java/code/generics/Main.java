package code.generics;

import homework.person.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        OldBox oldBox = new OldBox("test");
        OldBox oldBoxInteger = new OldBox(12);
        if (oldBox.getItem() instanceof String) {
            System.out.println(((String) oldBox.getItem()).length());
        }

        if (oldBoxInteger.getItem() instanceof Integer) {
            System.out.println(((Integer) oldBoxInteger.getItem()) > 10);
        }

        Box<String> box = new Box<>("String");
        System.out.println(box.getItem().length());

        Box<Person> boxInt = new Box<>(new Person("tst", "Mihai", 44));
        System.out.println(boxInt.getItem().name());

        BoxNumbers<Integer> boxNumbers = new BoxNumbers<>(44);
        System.out.println(boxNumbers.getLengthOfName(new Person("tst", "Mihai", 44)));
        List<? extends Number> numbers = new ArrayList<>();

    }
}

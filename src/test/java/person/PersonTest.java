package person;

import homework.person.Person;
import homework.person.exceptions.ValidationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.UUID;

public class PersonTest {

    @Test
    void createPersonWithCorrectParameters() {
        Person person = new Person(UUID.randomUUID().toString(), "Jojo", 44);
    }

    @Test
    void createPersonWithNullName() {
        Assertions.assertThrows(ValidationException.class, () -> new Person("test", null, 44));
    }

    @Test
    void createPersonWithNullage() {
        Assertions.assertThrows(ValidationException.class, () -> new Person("test", "Jojo", null));
    }

}

package person;

import homework.person.Person;
import homework.person.PersonService;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonServiceTest {
    @Test
    void initClass() {
        List<Person> persons = List.of(new Person(UUID.randomUUID().toString(), "Jojo", 44));
        PersonService personService = new PersonService(persons);
    }

    @Test
    void testNullAsParameter() {
        PersonService personService = new PersonService(null);
    }

    @Test
    void testAddPersonMethod() {
        List<Person> persons = List.of(new Person(UUID.randomUUID().toString(), "Jojo", 44));
        PersonService personService = new PersonService(persons);
        Person person = personService.addPerson(new Person(null, "Mihai", 22));

        assertThat(person.id()).isNotNull();
        assertThat(person.name()).isEqualTo("Mihai");
        assertThat(person.age()).isEqualTo(22);
        assertThat(personService.getPersons()).hasSize(2);
    }
}

package homework.person;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public Person addPerson(Person person) {
        Person addPerson = new Person(randomUUID().toString(), person.name(), person.age());
        persons.add(addPerson);
        return addPerson;
    }

    public List<Person> getPersons() {
        return persons;
    }
}

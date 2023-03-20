package homework.person;

import homework.person.exceptions.ValidationException;

public record Person(
        String id,
        String name,
        Integer age
) {
    public Person {
        validateNameNotNull(name);
        validateAgeNotNull(age);
    }

    private void validateAgeNotNull(Integer age) {
        if (age == null) {
            throw new ValidationException();
        }
    }

    private void validateNameNotNull(String name) {
        if (name == null) {
            throw new ValidationException();
        }
    }
}

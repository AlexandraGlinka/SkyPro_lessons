package lesson13_classes_methods.test1;

public class PersonService {
    public boolean isAdult(Person person) {
        return person.getAge() >= 18;
        // Person - тип параметра
        // person - имя параметра
    }
}

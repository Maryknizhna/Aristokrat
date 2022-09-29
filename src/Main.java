import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Антуан","де Сент-Экзюпери", 40));
        persons.add(new Person("Дени", "Дидро", 30));
        persons.add(new Person("Геральт", "из Ривии", 35));
        persons.add(new Person("Роберт", "де Ниро", 5));
        persons.add(new Person("Анджелина", "Джоли", 3));
        Collections.sort(persons, new PersonComparator(2));
        Predicate<Person> predicate = person -> person.getAge() < 18;
        persons.removeIf(predicate);
        System.out.println(persons);
    }
}

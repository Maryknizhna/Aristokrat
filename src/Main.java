import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Антуан","де Сент-Экзюпери", 40));
        persons.add(new Person("Дени", "Дидро", 30));
        persons.add(new Person("Геральт", "из Ривии", 35));
        Collections.sort(persons, new PersonComparator(2));
        System.out.println(persons);
    }
}

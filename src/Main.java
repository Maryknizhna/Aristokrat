import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Антуан","де Сент-Экзюпери", 40));
        persons.add(new Person("Дени", "Дидро", 30));
        persons.add(new Person("Геральт", "из Ривии", 35));
        Comparator<Person> personComparatorSurnameNameAge3 = (p1, p2) -> {
            if (Math.min(p1.getSurname().split(" ").length, 3) != (Math.min(p2.getSurname().split(" ").length, 3))) {
                return Integer.compare(p1.getSurname().split(" ").length, p2.getSurname().split(" ").length);
            }
            return Integer.compare(p1.getAge(), p2.getAge());
        };
        Collections.sort(persons, personComparatorSurnameNameAge3);
        for (Person person : persons) {
            System.out.println(person);
        }

    }
}

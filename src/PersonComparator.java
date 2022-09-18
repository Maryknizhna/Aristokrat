import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxWords;

    public PersonComparator(int maxCountWords) {
        this.maxWords = maxCountWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getWordsSurname() < maxWords || o2.getWordsSurname() < maxWords) {
            if (o1.getWordsSurname() < o2.getWordsSurname()) {
                return 1;
            } else if (o1.getWordsSurname() > o2.getWordsSurname()) {
                return -1;
            }
        }
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}

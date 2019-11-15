import java.util.ArrayList;
import java.util.List;

public class WorkPerson {
    public static List<Person> createPerson() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person());
        persons.add(new Person(11, "name"));
        return persons;
    }

    public static int findMaxAge(List<Person> persons) {
        int res = persons.get(0).getAge();
        for (int i = 0; i < persons.size(); i++) {
            if (res < persons.get(i).getAge()) {
                res = persons.get(i).getAge();
            }
        }
        return res;
    }
}

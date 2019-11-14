import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class FileUtils {
    public static List<String> readAll(final String path) throws IOException {
        List<String> lines = new Vector<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            throw new IOException();
        }
    }

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
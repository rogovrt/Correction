import java.util.Objects;

public class Person {
    private int age;
    private String name;

    public Person() {}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ) throw new IllegalArgumentException("Age can't be less than zero");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (obj instanceof Person) {
            Person compare = (Person)obj;
            return ((this.age == compare.getAge()) && (this.name == compare.getName()));
        }
        else
            return false;
    }

    public int hashCode() {
        int res = 31;
        res = res * 17 + age;
        res = res * 17 + name.hashCode();
        return res;
    }
}
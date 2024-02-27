package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new LinkedList<Person>();
        people.add(person3);
        people.add(person2);
        people.add(person4);
        people.add(person1);

        for (Person person : people){
            System.out.println(person);
        }
    }
}

class Person{
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }
}

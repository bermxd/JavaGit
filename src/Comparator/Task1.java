package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("frog");
        animals.add("bird");
        animals.add("a");
        animals.add("ss");

        Collections.sort(animals, new StringLengthComarator());
        System.out.println(animals);


        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(0);
        numbers.add(500);
        numbers.add(100);

        Collections.sort(numbers, new Comparator<Integer>() { // анонимный класс ввместо создания полноценного класса для animals
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(numbers);



        List<Person> people = new ArrayList<>();

        people.add(new Person(3, "Mike"));
        people.add(new Person(2, "Katy"));
        people.add(new Person(1, "Bob"));

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        System.out.println(people);
    }
}

class StringLengthComarator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        /*
        o1>o2 => 1
        o1<02 => -1
        o1==o2 => 0
         */
        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class Person{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}

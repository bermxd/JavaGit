package Collection_Data.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue1 {
    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> people = new ArrayBlockingQueue<Person>(3);
        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));



    }
}
//Throws exception  Return special value
//add               offer
//remove            poll
//element           peek

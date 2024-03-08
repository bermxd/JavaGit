package Collection_Data.HashcodeEquals;

import java.util.*;

public class HashcodeEquals {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();


        Person person1 = new Person(1, "Mike");
        Person person2 = new Person(1, "Mike");

        map.put(person1, "123");
        map.put(person2, "1233");

        set.add(person1);
        set.add(person2);

        System.out.println(map);
        System.out.println(set);

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

//    {object} -> {int} Таким образом, преобразуем объект с помощью хэширования(хэш-функции) и сравниваем два объекта по хэшу (int)
//    Быстро, но неточно, хэш может совпадать, а объекты будут разные(коллизия)
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

/*
Контракт hashcode() equals ()
1) У двух проверяемых объектов вызываем метод hashcode()
Если хэши разные -> два объекта точно разные

2) Если хэши одинаковые -> equals()
3) equals() -> выдает ответ
 */
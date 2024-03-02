package Collection_Data.Iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterable {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

// Как было до JAVA 5 !!! Дает возможность изменить list во время прохождения по нему
        Iterator<Integer> iterator = list.iterator();

        int idx = 0;
        while (iterator.hasNext()){
            System.out.println(iterator.next());

            if (idx == 1)
                iterator.remove();

            idx++;
        }


        //Java 5
        for (int x : list){
            System.out.println(x);
        }
    }
}

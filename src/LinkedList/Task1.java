package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        measureTime(linkedList);
        measureTime(arrayList);
    }

    private static void measureTime(List<Integer> list){



        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.add(0, i);
        }


//        for (int i = 0; i < 100000; i++){ // linked - 2800 ms, array - 3 ms
//            list.get(i);
//        }



        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

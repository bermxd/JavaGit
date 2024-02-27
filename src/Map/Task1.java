package Map;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        //        !!!Массив связных списков!!!
        Map<Integer, String> map= new HashMap<>();

        map.put(1, "Один");
        map.put(2, "Два");
        map.put(3, "Три");

//        System.out.println(map);
//
//        map.put(3, "Тройка");
//
//        System.out.println(map);
//
//        System.out.println(map.get(1));

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
// НЕ ВАЖЕН ПОРЯДОК ПРИ ИЗВЛЕЧЕНИИ!!! НЕ ГАРАНТИРУЕТ ПОРЯДОК!!!
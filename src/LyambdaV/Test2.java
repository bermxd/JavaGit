package LyambdaV;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArr(arr1);
        fillList(list1);


//        for(int i = 0; i < 10; i++){
//            arr[i] = arr[i] * 2;
//            list.set(i, list.get(i)*2);
//        }
//      map method
        arr1 = Arrays.stream(arr1).map(a -> a*2).toArray();
        list1 = list1.stream().map(a -> a*2).toList();

//        arr1 = Arrays.stream(arr1).map(a -> 3).toArray();

        System.out.println(list1);
        System.out.println(Arrays.toString(arr1));

        //filter method

        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 == 0).toList();

        System.out.println(list2);
        System.out.println(Arrays.toString(arr2));

//        forEach
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

//        reduce

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillList(list3);
        fillArr(arr3);
// Можно задать начальное значение acc: reduce(0, (acc, b) -> ...) Тогда подсчет начнется с 0 элемента равным 0, Если не указывать, то подсчет начинается с 1 элемента
        int sum1 = Arrays.stream(arr3).reduce((acc, b) -> acc + b).getAsInt();
        int product = list3.stream().reduce((acc,b) -> acc * b).get();

        System.out.println(sum1);
        System.out.println(product);

        int[] arr4 = new int[10];
        fillArr(arr4);

        arr4 = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a*2).toArray();
        System.out.println(Arrays.toString(arr4));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);

        set = set.stream().map(a -> a*5).collect(Collectors.toSet());
        System.out.println(set);



    }

        private static void fillList(List<Integer> list){
            for (int i = 0;i < 10; i++){
                list.add(i+1);
            }
        }

        private static void fillArr(int[] arr){
            for (int i = 0;i < 10; i++){
                arr[i] = i+1;
            }
        }
    }

package RegularExpr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String a = "Hello234324234there213123hey123123qwerty";
        String [] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));


        String b = "Hello there hey";
        String modifiedString = b.replace(" ", ".");
        System.out.println(modifiedString);
    }
}
// replaceAll - если нет конкретного символа, а паттерн Hello12312hey replaceAll("\\d+"," ")
// replaceFirst - только первое
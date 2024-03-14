package RegularExpr;

public class Task0 {
    public static void main(String[] args) {
        /*
        regExLib.com

        \\d - Одна цифра
        \\w - одна буква = [a-zA-Z]
        + - 1 или более
        * - 0 или более
        ? - 0 или 1 символов ДО

        (|) - один элемент из множества

        [a-zA-Z]- все англ буквы
        [0-9] - все цифры
        [^abc] - Все символы кроме [abc]

        . - любой символ

        {2} - 2 символа ДО
        {2,} - от 2 символов
        {2, 4} - от 2 до 4 символов

         */

        String a = "234";
        String b = "+234";
        String c = "-234";
        System.out.println(a.matches("(\\+|-)?\\d*"));
        System.out.println(b.matches("(\\+|-)?\\d*"));
        System.out.println(c.matches("(\\+|-)?\\d*"));

        String d = "S12345";
        System.out.println(d.matches("[a-zA-Z]+\\d*"));

        String e = "hah";
        System.out.println(e.matches("[^abc]"));

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));

        String f = "123";
        System.out.println(f.matches("\\d{2,}"));


    }
}

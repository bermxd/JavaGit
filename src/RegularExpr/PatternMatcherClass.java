package RegularExpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherClass {
    public static void main(String[] args) {
        String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n" +
                "keep in touch. Thanks, Joe! That's cool. I am sending you \n" +
                "my address: tim@yandex.ru. Let's stay in touch...";
        Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)"); //отдельная группа в () - слева направо, начиная с 1 (не с нуля), если вложенность - внешняя первая
        Matcher matcher = email.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group(2)); // без индекса - строка целиком, индекс - номер группы ()
        }

    }
}

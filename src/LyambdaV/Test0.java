package LyambdaV;

interface Executable {
    int execute(int x, int y);
}

class Runner{
    public void run(Executable e) {
       int a = e.execute(10, 20);
        System.out.println(a);
    }
}
public class Test0 {
    // Анонимный метод (без названия) !Только если в интерфейсе один метод
    public static void main(String[] args) {
        Runner runner = new Runner();
        int a = 1; //final or effectively final
        // у аноним класса есть своя область видимости, у лямбда выражения область видимости там, где она создана
        runner.run((x, y) -> x+y+a);
    }
}

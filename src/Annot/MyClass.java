package Annot;

public class MyClass {
    @Deprecated
    public static void myMethod(){
        System.out.println("Hello from myMethod");
    }
}

class Test1{
    public static void main(String[] args) {
        MyClass.myMethod();
    }

}

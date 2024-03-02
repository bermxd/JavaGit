package Collection_Data.Stack;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> stack = new java.util.Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(1);

        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.peek());


    }
}

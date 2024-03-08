package Collection_Data.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(20);
        myLinkedList.add(10);

        System.out.println(myLinkedList);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(0));

        myLinkedList.remove(1);
        System.out.println(myLinkedList);
    }
}

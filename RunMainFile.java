package linkedList;

/**
 * Created by Farhan Zia Sheikh on 2017-05-09.
 */
public class RunMainFile {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(21);
        linkedList.add(122);
        linkedList.add(555);
        linkedList.add(14);
        linkedList.add(2);
        linkedList.add(333);
        linkedList.add(35);
        linkedList.printLinkedList();

        linkedList.deleteTailElement();
        linkedList.printLinkedList();

        linkedList.deleteTailElement();
        linkedList.printLinkedList();

        linkedList.deleteTailElement();
        linkedList.printLinkedList();

        linkedList.deleteAllElementsWithDataGreaterThan(100);
        linkedList.printLinkedList();
    }
}

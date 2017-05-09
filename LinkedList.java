package linkedList;

/**
 * Created by Farhan Zia Sheikh on 2017-05-09.
 */

public class LinkedList {
    public Node head;
    public int listCount;

    public LinkedList() {
        head = new Node(0);
        listCount = 0;
    }

    public void printLinkedList() {
        System.out.println("----- printLinkedList ----- ");
        System.out.println(" listCount = " + listCount);
        Node current = head;
        while (current.next != null) {
            System.out.print(current.next.data + " -> ");
            current = current.next;
        }
        System.out.println("");
        System.out.println("----------------------------------- ");
    }

    public boolean add(int dataToAdd) {
        Node end = new Node(dataToAdd);
        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = end;
        listCount++;
        System.out.println(dataToAdd + " appended to linked list");
        return true;
    }

    public void deleteAllElementsWithDataGreaterThan(int dataGreaterThan) {

        Node current = head;

        while (current.next != null) {
            if (current.next.data > dataGreaterThan) {
                current.next = current.next.next;
                listCount--;
                System.out.println("Success! Element with data greater than " + dataGreaterThan + " deleted.");
            }
            else{
                current = current.next;
            }
        }
    }

    public void deleteTailElement() {

        Node node = head;
        if (head == null || head.next == null)
            System.out.println("Delete Last Node Failed: empty linked list!!");
        else{
            while(node.next.next != null) {
                node = node.next;
            }
            listCount--;
            System.out.println("Success! tail deleted.");
        }
        node.next = null;
    }
}
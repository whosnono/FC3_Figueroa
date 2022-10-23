package doublylinkedlist;

/**
 * Equipo:
 * Figueroa Hernández Sofia Belem
 * Matus Valencia Elda Berenice
 */
public class MainDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList dLL = new DoublyLinkedList();
        dLL.createDoublyLinkedList(5);

        dLL.insertInLinkedList(6, 1);
        dLL.insertInLinkedList(7, 2);
        dLL.insertInLinkedList(8, 3);
        dLL.insertInLinkedList(9, 4);
        System.out.println("The size of the linked list is: " + dLL.size);
        System.out.println(" ");
        System.out.println("Doubly Linked List: ");
        dLL.traverseDoublyLinkedList();
        dLL.searchNode(6);
        //dLL.deletionOfNode(0);
        //dLL.deleteDLL();

        System.out.println(" ");
        System.out.println("Head prev: " + dLL.head.prev);
        System.out.println("Head: " + dLL.head.value);
        System.out.println("Head next: " + dLL.head.next.value);

        System.out.println("Tail prev: " + dLL.tail.prev.value);
        System.out.println("Tail: " + dLL.tail.value);
        System.out.println("Tail next: " + dLL.tail.next);
    }
}

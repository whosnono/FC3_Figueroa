package doublylinkedlist;

/**
 * Equipo:
 * Figueroa Hernández Sofia Belem
 * Matus Valencia Elda Berenice
 */
public class DoublyLinkedList {

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public Node createDoublyLinkedList(int nodeValue) {
        Node node = new Node();
        node.prev = head;
        node.next = tail;
        node.value = nodeValue;

        head = node;
        tail = node;
        head.prev = null;
        tail.next = null;
        size = 1;
        return head;
    }

    // Insert Method DoublyLinkedList
    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createDoublyLinkedList(nodeValue);
            size = 0;
        } else if (location == 0) {
            node.next = head;
            if (head != null) {
                head.prev = node;
            }
            head = node;
        } else if (location >= size) {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = null;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.prev = tempNode;
            node.next = nextNode;
        }
        size++;
    }

    // DoublyLinkedList Traversal
    public void traverseDoublyLinkedList() {
        if (head == null) {
            System.out.println("DLL does not exist!");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <--> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // Search for a node
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found the node "+ nodeValue +" at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.print("Node " + nodeValue +" was not found! ");
        return false;
    }

    //Deleting a node from DoublyLinkedList
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The SLL does not exist");
        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

//  Delete Entire DoublyLinkedList
    public void deleteDLL() {
        head = null;
        tail = null;
        System.out.println("The SLL deleted successfully");

    }

}

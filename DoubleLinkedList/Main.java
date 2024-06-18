package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.createDLL(1);
        doublyLinkedList.insertDLL(2, 1);
        doublyLinkedList.insertDLL(3, 2);
        doublyLinkedList.insertDLL(4, 3);
        doublyLinkedList.insertDLL(5, 2);
        // Expected output: 1 <-> 2 <-> 5 <-> 3 <-> 4
        doublyLinkedList.traverseDLL();  
        // Expected output: 4 <-> 3 <-> 5 <-> 2 <-> 1
        doublyLinkedList.reverseTraverseDLL();  
        // Expected output: Node found at location: 3
        doublyLinkedList.searchDLL(3);  
        // Expected output: Node not found
        doublyLinkedList.searchDLL(6);  
        doublyLinkedList.deleteNodeDLL(3);
        // Expected output: 1 <-> 2 <-> 5 <-> 4
        doublyLinkedList.traverseDLL();  
        // Expected output: The DLL has been deleted
        doublyLinkedList.deleteDLL(); 
        // Expected output: DLL does not exist:
        doublyLinkedList.traverseDLL();  
    }
}

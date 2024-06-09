package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.insertInLinkedList(1, 0);
        singleLinkedList.insertInLinkedList(2, 1);
        singleLinkedList.insertInLinkedList(3, 2);
        singleLinkedList.insertInLinkedList(4, 3);
        singleLinkedList.insertInLinkedList(5, 1); 
        singleLinkedList.traverseLinkedList();

        singleLinkedList.deleteNode(0); 
        singleLinkedList.traverseLinkedList();

        singleLinkedList.deleteNode(2); 
        singleLinkedList.traverseLinkedList();

        singleLinkedList.deleteNode(1); 
        singleLinkedList.traverseLinkedList();
    }
}
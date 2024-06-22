//Given the head of a Singly LinkedList, write a method to return the middle node of the LinkedList.
//If the total number of nodes in the Linked list is even, return the second middle node.
//Example: 1 -> 2 -> 3 -> 4 -> 5 -> null
//Output: 3

public class MiddleLinkedList{
    
    public Node head;

    public class Node{
       
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

//take two pointers
//make both pointing to the first node
//increment first with two nodes and second with one at a time
//Loop until the 1st loop reaches the end. At this point, 2nd will be at the middle.

    public static Node findMiddle(Node head){
        Node slow = null;
        Node fast = null;
        slow = head;
        fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    //print the code

    public void print(Node head){
        while(head != null){
            System.out.print(head.data + " -> ");
            head = head.next;
        }

    }
    public static void main(String[] args) {
        MiddleLinkedList list = new MiddleLinkedList();
        Node head = list.new Node(1);
        head.next = list.new Node(2);
        head.next.next = list.new Node(3);
        head.next.next.next = list.new Node(4);
        head.next.next.next.next = list. new Node(5);

        System.out.println("Original Linked List: ");
        list.print(head);
        System.out.println();
        System.out.println();

        Node middle = findMiddle(head);
        System.out.println("The middle node: " + middle.data);


    }
}

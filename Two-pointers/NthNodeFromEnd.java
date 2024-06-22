//Given a singly linked list, remove the nth node from end of list
public class NthNodeFromEnd {

   public Node head;

   public class Node{
       int data;
       Node next;
       Node(int data){
           this.data = data;
           this.next = null;
       }
   }
   public Node removeNthLastNode(Node head, int n){
       Node right = null; // Pointer to traverse the list
       Node left = null;  // Pointer to find the nth node from the end
       right = head;
       left = head;

       // If the list is empty, return null
       if(head == null){
           return null;
       }

       // Move the right pointer n steps ahead
       for(int i = 0; i < n; i++){
           // If n is greater than the length of the list, return null
           if (right == null){
               return null;
           }

           right = right.next;
       }

       // Move both pointers until the right pointer reaches the end of the list
       while(right != null){  // After this loop, the left pointer will be at the nth node from the end
           right = right.next;
           left = left.next;
       }

       return left;
   }

   public void print(Node head){
       while(head != null){
           System.out.print(head.data + " -> ");
           head = head.next;
       }
   }

   public static void main(String[] args) {
       NthNodeFromEnd list = new NthNodeFromEnd();
       Node head = list.new Node(4);
       head.next = list.new Node(3);
       head.next.next = list.new Node(9);
       head.next.next.next = list.new Node(6);

       list.print(head);
       System.out.println();
       int n = 2;
       Node result = list.removeNthLastNode(head, n);
       System.out.println(n + "th element to last is " + result.data);
   }
}

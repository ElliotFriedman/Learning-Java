package linkedlists;

public class LinkedLists
{
    public static void print_list(Node a)
    {
        while (a != null)
        {
            System.out.println(a.element);
            a = a.next;
        }
    }
    
    public static void main(String[] args)
    {
        Node head = new Node("head");
        Node tail = new Node("tail");
        
        Node a = new Node("a node");
        head = a;
        tail = a;
        //a.next = null;
        
        
        Node b = new Node("b node");
        a.next = b;
        a = a.next;
        
        Node c = new Node("c node");
        a.next = c;
        a = a.next;
        
        Node d = new Node("d node");
        a.next = d;
        
        tail = d;

        
        print_list(head);
        
    }    
}

public class LinkedList 
{ 
    Node head;  // head of list 
  
    /* Linked list Node*/
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
    public void push(int val)
    {
        if(head==null)
        {
            Node new_node=new Node(val);
            head=new_node;
        }
        else
        {
            Node reach=head;
            while(reach.next!=null)
            {
                reach=reach.next;
            }
            Node new_node=new Node(val);
            reach.next=new_node;
            
        }
    }
    public int listLength()
    {
        Node c=head;
        int l=0;
        while(c!=null)
        {
            l++;
            c=c.next;
        }
        return l;
    }
    public void inFront(int val)
    {
        Node new_node=new Node(val);
        new_node.next=head;
        head=new_node;
    }
    public void printList() 
    { 
        Node tnode = head; 
        while (tnode != null) 
        { 
            System.out.print(tnode.data+" "); 
            tnode = tnode.next; 
        } 
    } 
    public void delete(int pos)
    {
        if(pos==1)
        {
            head=head.next;
        }
        Node tnode,temp;
        tnode=head;
        temp=head;
        LinkedList llist=new LinkedList();
        int l=llist.listLength();
        if(pos==l)
        {
            Node tr=head;
            while(tr.next!=null)
            {
                tr=tr.next;
            }
            tr.next=null;
            
        }
       else
       {
        while(pos!=1)
        {
            temp=tnode;
            tnode=tnode.next;
            pos--;
            
        }
        temp.next=tnode.next;
       }  
        
    }
      public static void main(String[] args) 
    { 
        /* Start with the empty list */
        LinkedList llist = new LinkedList(); 
  
        // Insert 6.  So linked list becomes 6->NUllist 
  //      llist.append(6); 
  
        // Insert 7 at the beginning. So linked list becomes 
        // 7->6->NUllist 
        llist.push(7);
          llist.push(8);
            llist.push(9);
              llist.push(10);
  
        // Insert 1 at the beginning. So linked list becomes 
        // 1->7->6->NUllist 
        llist.push(1); llist.inFront(111);
            System.out.println("\nCreated Linked list is: "); 
        llist.printList();
        System.out.println();
        System.out.println("length of list before delete "+ llist.listLength());
        llist.delete(4);
           llist.printList();
            System.out.println();
           
        
        System.out.println("length of list "+ llist.listLength());
         llist.delete(5);
              llist.printList();
               System.out.println();
         System.out.println("length of list after delete "+ llist.listLength());
}    }
    

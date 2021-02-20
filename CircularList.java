public class CircularLinkedList
{ Node head=null;
int length=0;
   private class Node
    {
        Node next;
        int data;
        Node(int data)
        {this.data=data;}
    }
    
    public boolean isEmpty()
    {return length==0;}
    
    public void CreateCircularlinklist()
    {
        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(3);
        Node four=new Node(4);
        Node five=new Node(5);
        
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=one;
        
        head=four;
        
    }
    
    
    public void display()
    {
        Node temp;
        if(head==null)
        {return ;
        }
        temp=head.next;
      //  System.out.println("data is"+head.data);
        while(temp!=head)
        {
            System.out.println("data is"+temp.data);
            temp=temp.next;
        }
         System.out.println("data is"+temp.data);
           
        
    }
    
    public static void main(String []args)
    {
       
        CircularLinkedList cl=new CircularLinkedList();
        cl.CreateCircularlinklist();
        cl.display();
        
        
    }
}
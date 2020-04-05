/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static Node head=null;
    static Node traverse;
    static Scanner sc=new Scanner(System.in);
    static class Node
    {
      int data;
      Node next;
      Node(int d)
      {
          data=d;
          next=null;
      }
      
    }
	public static void main(String[] args) {
	while(true)
	{
	    System.out.println("1. append");
	    System.out.println("2. display");
	     System.out.println("3. length");
	        System.out.println("4. delete");
	     System.out.println("5. insert");
	     System.out.println("6. deleteAll");
	     System.out.println("7. find element");
	     System.out.println("8. find nTh node");
	     System.out.println("9. find from last");
	     System.out.println("10. find middle");
	     System.out.println("11. make circularLinkedList");
	     System.out.println("12. Check palindrome");
	
	   System.out.println("1000. quit");
	    System.out.println("Enter your choice");
	    int choice;
	    choice=sc.nextInt();
	    switch(choice)
	    {
	        case 1:
	            append();
	            break;
	            
	       case 2:
	           display();
	           break;
	      
	       
	       case 3:
	           int length=length();
	           System.out.println(length);
	           break;
	       case 4:
	           delete();
	           break;    
	       case 5:
	           insert();
	           break;
	       case 6:
	           deleteAll();
	           break;
	       case 7:
	           findelement();
	           break;
	       case 8:
	           findNthNode();
	           break;
	       case 9:
	           findFromEnd();
	           break;
	           
	       case 10:
	       findMiddle();
	          break;
	      case 11:
	          circularLinkedList();
	          break;
	   case 12:
	       checkpalindrome();
	       break;
	       case 1000:
	           System.exit(0);
	           default:
	           System.out.println("invalid input");
	    }
	    
	    
	}
}	
	static void append()
	{
	    System.out.println("How many nodes do you want to append");
	    int length=sc.nextInt();
	    System.out.println("enter data to nodes");
	    for(int i=0;i<length;i++)
	    {
	      int data=sc.nextInt();
	      Node temp=new Node(data);
	      if(head==null)
	      {
	          head=temp;
	      }
	      else
	      {
	          traverse=head;
	          while(traverse.next!=null)
	          {
	              traverse=traverse.next;
	          }
	          
	          traverse.next=temp;
	      }
	    }
	}
	static void display()
	{
	    
	    traverse=head;
	    if(traverse==null)
	    {
	        System.out.println("empty list");
	     
	    }
	       else{
	             while(traverse!=null)
	             {
	                  System.out.println(traverse.data);
	                  traverse=traverse.next;
	             }
	       }
	}
	static int length()
	{
	    int count=0;
	    if(head==null)
	    {
	        return 0;
	    }
	    else
	    {
	        traverse=head;
	        while(traverse!=null)
	        {
	            count++;
	            traverse=traverse.next;
	        }
	    }
	    return count;
	}
	static void insert()
	{
	    System.out.println("ENter position");
	    int position=sc.nextInt();
	    Node temp=new Node(1000);
	    int length=length();
	    if(position==1)
	    {
	      traverse=head;
	      head=temp;
	      temp.next=traverse;
	    }
	    else if(position==length)
	    {
	        traverse=head;
	        while(traverse.next!=null)
	        {
	            traverse=traverse.next;
	        }
	        traverse.next=temp;
	    }
	    else
	    {
	        
	        traverse=head;
	        for(int i=0;i<position-2;i++)
	        {
	          traverse=traverse.next;  
	        }
	        Node tempp=traverse.next;
	        traverse.next=temp;
	        temp.next=tempp;
	    }
	}
	static void delete()
	{
	    System.out.println("which node do you want to delete");
	    int del=sc.nextInt();
	     int length=length();
	    if(del==1)
	    {
	        Node temp=head.next;
	        head=null;
	        head=temp;
	    }
	   else if(del==length)
	   {
	       traverse=head;
	       for(int i=0;i<length-2;i++)
	       
	       {
	           traverse=traverse.next;
	       }
	       traverse.next=null;
	   }
	    else
	    {
	        traverse=head;
	      for(int i=0;i<del-2;i++)
	      {
	          traverse=traverse.next;
	      }
	      Node temp=traverse.next.next;
	      traverse.next=null;
	      traverse.next=temp;
	      
	    }
	}
	static void deleteAll()
	{
	    head=null;
	   
	    
	    
	}
	static void findelement()
	{
	    System.out.println("enter element you want to search");
	    int ele=sc.nextInt();
	    traverse=head;
	    int i=0;
	  while(traverse!=null)
	    {
	         i++;
	        if(traverse.data==ele)
	        {
	            System.out.println("element found at position"+ i);
	            break;
	        }
	       
	        traverse=traverse.next;
	    }
	    
	}
	static void findNthNode()
	{
	    System.out.println("Enter n ");
	    int n=sc.nextInt();
	    if(n==1)
	    {
	        System.out.print(head.data);
	    }
	    else
	    {
	     traverse=head;
	     for(int i=0;i<n-1;i++)
	     {
	         traverse=traverse.next;
	     }
	     System.out.println(traverse.data);
	    }
	}
	static void findFromEnd()
	{
	    System.out.println("enter N for find from last");
	    int n=sc.nextInt();
	    
	    int length=length();
	    n=length-n+1;
	    traverse=head;
	    if(n>length)
	    {
	        System.out.println("linklist have only"+ length+ "  nodes");
	    }
	    else{
	        for(int i=0;i<n-1;i++)
	        {
	            traverse=traverse.next;
	        }
	        System.out.println(traverse.data);
	    }
	    
	}
	static void findMiddle()
	{
	    traverse=head;
	    Node traverseFast=head;
	    while(traverseFast!=null&&traverseFast.next!=null)
	    {
	        traverse=traverse.next;
	        traverseFast=traverseFast.next.next;
	    }
	    System.out.println(traverse.data);
	}
	static void circularLinkedList()
	{
	    traverse=head;
	          while(traverse.next!=null)
	          {
	              traverse=traverse.next;
	          }
	          
	          traverse.next=head;
	          Node tempCircular=head;
	          System.out.println(tempCircular.data);
	          tempCircular=tempCircular.next;
	          while(tempCircular!=head)
	          {
	              System.out.println(tempCircular.data);
	              tempCircular=tempCircular.next;
	          }
	}
	static void checkpalindrome()
	{
	    traverse=head;
	    int length=length();
	    Stack stack=new Stack();
	    if(length==1)
	    {
	        System.out.println("is palindrome");
	        
	    }
	    else
	    {
	    if(length%2==0)
	    {
	        for(int i=0;i<(length/2);i++)
	        {
	            traverse=traverse.next;
	          stack.push(traverse.data);
	          
	        }
	        while(traverse!=null)
	        {
	            int check=(int)stack.pop();
	            if((int)check!=traverse.data)
	            {
	                System.out.println("Not palindrome");
	                break;
	            }
	           
	        }
	         if(traverse==null)
	            {
	                System.out.println("is palindrome");
	            }
	    }
	    }
	}
}
	
	


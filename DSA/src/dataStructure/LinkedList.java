package dataStructure;

public class LinkedList { 
	  
    Node head; 
  
   
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    
    public static LinkedList insertEnd(LinkedList list, int data) 
    { 
       
        Node new_node = new Node(data); 
        //new_node.next = null; 
  
        
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            
            last.next = new_node; 
        } 
  
        
        return list; 
    } 
    public static LinkedList insertBegin(LinkedList ll, int value)
    {
    	Node newNode = new Node(value);
    	if(ll.head==null)
    		ll.head = newNode;
    	else {
    		newNode.next = ll.head;
    		ll.head = newNode;
    		
    	}
    	return ll;
    }
    public static LinkedList insertAfter(LinkedList ll, int prevNodeValue, int value )
    {
    	Node newNode = new Node(value);
    	if(ll.head == null)
    		ll.head = newNode;
    	else {
    		Node temp = ll.head;
    		while(temp.data!=prevNodeValue)
    		{
    			temp = temp.next;
    		}
    		newNode.next = temp.next;
    		temp.next = newNode;
    		
    	}
    	return ll;
    }
    public static LinkedList deleteBegin(LinkedList ll)
    {
    	Node temp = ll.head;
    	if(temp!=null)
    	{
    		ll.head = ll.head.next;
    		System.out.println("begin node deleted");
    	}
    		
    	return ll;
    }
    public static LinkedList deleteEnd(LinkedList ll)
    {
    	Node temp = ll.head,prev=null;
    while(temp.next!=null)
    {
    	prev = temp;
    	temp = temp.next;
    }
    prev.next = null;
    System.out.println("last node deleted");
    
    	return ll;
    }
    public static LinkedList deleteKey(LinkedList ll, int key)
    {
    	Node temp = ll.head, prev =null;
    	if(temp!=null && temp.data==key)
    	{
    		ll.head = ll.head.next;
    		return ll;
    	}
    	while(temp!=null && temp.data!=key)
    	{
    		prev = temp;
    		temp = temp.next;
    	}
    	if(temp!=null)
    	{
    		prev.next = temp.next;
    	}
    	if(temp==null)
    	{
    		System.out.println("key not found");
    	}
    	return ll;
    }
  public static LinkedList reverseList(LinkedList ll)
  {
	  Node current = ll.head,prev=null, next = null;
	  
	  while(current!=null)
	  {
		  next = current.next;
		  current.next = prev;
		  prev = current;
		  current = next;
	  }
	  ll.head = prev;
	   
	  return ll;
  }
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
//        list = insertEnd(list, 1); 
//        list = insertEnd(list, 2); 
//        list = insertEnd(list, 3); 
//        list = insertEnd(list, 4); 
//        list = insertEnd(list, 5); 
//        list = insertEnd(list, 6); 
//        list = insertEnd(list, 7); 
//        list = insertEnd(list, 8); 
//        list = insertEnd(list, 19);
//        list = insertBegin(list, 0);
//        list = insertAfter(list,3,12);
//        list = deleteBegin(list);
//        list = deleteEnd(list);
//        list = deleteEnd(list);
//        list = deleteEnd(list);
//        list = deleteKey(list, 3);
//       
        insertEnd(list, 1);
        insertEnd(list, 2);
        insertEnd(list, 3);
        insertEnd(list, 4);
        insertEnd(list, 5);
        insertEnd(list, 6);
        reverseList(list);

  
        // Print the LinkedList 
        printList(list); 
    } 
} 
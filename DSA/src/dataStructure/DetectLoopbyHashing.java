package dataStructure;
import dataStructure.LinkedList;
import java.util.*;

public class DetectLoopbyHashing {
	
	
	
	
	public static class Loop extends LinkedList
	{
		public static boolean detectLoop(Node h)
		{
			HashSet<Node> s = new HashSet<Node>();
			while(h != null)
			{
				if(s.contains(h))
					return true;
				s.add(h);
				h = h.next;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		
		Loop list =  new Loop();
		list.insertEnd(list, 1);
		list.insertEnd(list, 2);
		list.insertEnd(list, 3);
		list.insertEnd(list, 4);
		
		//list.head.next.next.next.next = list.head.next;
		if(list.detectLoop(list.head))
		{
			System.out.println("loop found");
			
		}
		else System.out.println("no loop detected");
	}

}

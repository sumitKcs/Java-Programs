package dataStructure;
import dataStructure.LinkedList;

public class DetectLoopbyFloydCycle {

	public static class Floyd extends LinkedList{
		public static boolean floydLoopDetect(Node h)
		{
			Node slow = h, fast = h;
			while(slow != null && fast!=null && fast.next !=null)
			{
				slow = slow.next;
				fast = fast.next.next;
				
				if(slow == fast)
					return true;
			}
			return false;
		}
	}
	public static void main(String[] args) {
		Floyd list = new Floyd();
		
		list.insertEnd(list,1);
		list.insertEnd(list,2);
		list.insertEnd(list,3);
		list.insertEnd(list,4);
		list.insertEnd(list,5);
		
		//list.head.next.next.next.next.next = list.head.next;
		
		if(list.floydLoopDetect(list.head))
			System.out.println("Lood detected");
		else System.out.println("Lood not detected");
		

	}

}

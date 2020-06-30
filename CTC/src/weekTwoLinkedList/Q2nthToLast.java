package weekTwoLinkedList;

import weekTwoLinkedList.LinkedList.Node;

public class Q2nthToLast {
	
	public static Node nthToLast(LinkedList list, int n) {
		Node p1 = list.head;
		Node p2 = list.head;
		
		while(n!=0) {
			p1 = p1.next;
			n-=1;
		}
		
		while(p1!=null) {
			p2=p2.next;
			p1=p1.next;
		}
		
//		System.out.println(p1.data +" "+p2.data);
		
		
		return p2;
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

        list = list.insert(list, 1); 
        list = list.insert(list, 2);  
        list = list.insert(list, 3); 
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        
        // Print the LinkedList 
        list.printList(list);
        nthToLast(list, 2);
		Node n = nthToLast(list, 2);
		if (n != null) {
			System.out.println(2 + "th to last node is " + n.data);
		} else {
			System.out.println("null");
		}
	}

}

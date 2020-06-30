package weekTwoLinkedList;

import weekTwoLinkedList.LinkedList.Node;

public class Q4AddTwoNumbersLL {

	public static void main(String[] args) {
		
		LinkedList list1 = new LinkedList();
	    list1 = list1.insert(list1, 3); 
	    list1 = list1.insert(list1, 1);  
	    list1 = list1.insert(list1, 5);
	    
	    LinkedList list2 = new LinkedList();
	    list2 = list2.insert(list2, 5); 
	    list2 = list2.insert(list2, 9);  
	    list2 = list2.insert(list2, 4);
	    
	    list1.printList(list1);
	    list2.printList(list2);
	    
	    LinkedList list3 = addLists(list1, list2, 0);
	    list3.printList(list3);
	}

	private static LinkedList addLists(LinkedList list1, LinkedList list2, int carry) {
		
		Node head1 = list1.head;
		Node head2 = list2.head;
		
		LinkedList list3 = new LinkedList();
		Node cur = new Node(-1);
		list3.head = cur;
		Node prev = null;
		
		while(head1 != null || head2 !=null) {
			int val = carry;
			if(head1!=null)
				val+= head1.data;
			if(head2!=null)
				val+= head2.data;
			
			Node newNode = new Node(val%10);
			cur.data = val%10;
			prev = cur;
			cur.next = new Node(-1);
			cur = cur.next;
			
//			if(list3.head==null) {
//				list3.head = newNode;
//			}
//			else {
//				Node temp = list3.head;
//				while(temp.next!=null) {
//					temp = temp.next;
//				}
//				temp.next = newNode;
//				
//			}
			
			if(val>=10)
				carry=1;
			else
				carry=0;
//			System.out.println(head1.data+" "+head2.data+" "+val);
			
			if(head1 != null)
				head1 = head1.next;
			if(head2 != null)
				head2 = head2.next;
			
		}
		
		if(carry == 1) {
			cur.data = 1;
			prev = cur;
			cur.next = new Node(-1);
			cur = cur.next;
		}
		
//		System.out.println(cur.data);
		
		
		prev.next = null;
		return list3;
	}
	
	
	
}

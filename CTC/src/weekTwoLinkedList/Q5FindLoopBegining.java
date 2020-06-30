package weekTwoLinkedList;

import weekTwoLinkedList.LinkedList.Node;

public class Q5FindLoopBegining {

	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

        list = list.insert(list, 1); 
        list = list.insert(list, 2); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 5); 
        
        Node tempHead = list.head;
        while(tempHead.next != null)
        	tempHead = tempHead.next;
        tempHead.next = list.head.next.next;
//        System.out.println(list.head.next.next.data);
        
        tempHead = list.head;
        
        /* Printing the list with loop */
        int n = 6;
        System.out.println("The list is ");
        while(n>=0) {
        	System.out.print(tempHead.data+"  ");
        	tempHead = tempHead.next;
        	n-=1;
        }
        
        Node slw = list.head;
        Node fast = list.head;
        
        /*  We first get the point where the slowPtr and fastPtr meet  
         * Reset the slwPtr. At this point the slowPtr and fastPtr are k steps away 
         * from the start of the loop */
        do {
        	slw = slw.next;
        	fast = fast.next.next;
        }while(slw != fast);
        
        slw = list.head;
        while(slw!=fast) {
        	slw = slw.next;
        	fast = fast.next;
        }
        System.out.println();
        System.out.println("The loop starts from "+slw.data);
        
	}
}


/* Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
EXAMPLE
Input: the node ‘c’ from the linked list a->b->c->d->e
Result: nothing is returned, but the new linked list looks like a->b->d->e  */

package weekTwoLinkedList;

import weekTwoLinkedList.LinkedList.Node;

public class Q3DeleteNode {

	public static void deleteNode(Node node) {
		Node prev = null;
		while(node.next!=null) {
			prev = node;
			node.data = node.next.data;
			node = node.next;
		}
		
		prev.next = null;
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

        list = list.insert(list, 1); 
        list = list.insert(list, 2);  
        list = list.insert(list, 3); 
        list = list.insert(list, 4);
        list = list.insert(list, 5);
        list = list.insert(list, 6);
        
        list.printList(list);
        deleteNode(list.head.next.next.next.next); // delete node 4
        list.printList(list);
//        System.out.println(list.head.next.next.next.data);
	}
}

package weekTwoLinkedList;

import java.util.HashSet;

import weekTwoLinkedList.LinkedList.Node;

class LinkedList{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int n){
			data = n;
			next = null;
		}
	}
	
	public LinkedList insert(LinkedList list, int d) {
		Node node = new Node(d);
		node.next=null;
		if(list.head == null) {
			list.head = node;
		}
		else {
			Node last = list.head;
			while(last.next!=null)
				last = last.next;
			last.next = node;
		}
		
		return list;
	}
	
	public void printList(LinkedList list) {
		Node head = list.head;
		while(head!=null) {
			System.out.print(head.data+" ");
			head = head.next;
		}
		System.out.println();
	}
	
}

public class Q1RemoveDuplicates {

	
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); 

        list = list.insert(list, 10); 
        list = list.insert(list, 2); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 10); 
        
        // Print the LinkedList 
        list.printList(list);
        deleteDups2WithoutMem(list);
        list.printList(list);
	}
	
	public static LinkedList deleteDups2WithMem(LinkedList list) {
		HashSet<Integer> set = new HashSet<>();
		Node curHead = list.head;
		Node prev = null;
		
		while(curHead != null) {
			if(set.contains(curHead.data)) {
				prev.next = curHead.next;
//				System.out.println("HERE"+prev.data);
				break;
			}
			else {
				set.add(curHead.data);
				prev = curHead;
				curHead = curHead.next;
			}
		}
		
		
		return list;
	}
	
	
	/*  O(n^2) - iterate through every element for each element and fine duplicates   */
	public static LinkedList deleteDups2WithoutMem(LinkedList list) {
		Node cur = list.head;
		cur = cur.next;
		Node prev = list.head;
		
		while(cur!=null) {
			Node runner = list.head;
			while(runner != cur) {
				if(runner.data == cur.data) {
					Node temp = cur.next;
					prev.next = temp;
					cur = temp;
					break;
				}
				runner = runner.next;
			}
			if(runner == cur) {
				prev = cur;
				cur = cur.next;
			}
		}
		
		
		return list;
	}
}

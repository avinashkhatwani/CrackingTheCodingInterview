/* Given a binary search tree, design an algorithm which creates a linked list of all the
 *  nodes at each depth (eg, if you have a tree with depth D, you’ll have D linked lists).  */

package weekFourTreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q4 {

	static ArrayList<LinkedList<Integer>> createLinkedList(TreeNode root){
		ArrayList<LinkedList<Integer>> arr = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()) {
			int size = q.size();
//			System.out.println("__________________");
			LinkedList<Integer> curList = new LinkedList<>();
			for(int i=0; i<size; i++) {
				TreeNode cur = q.remove();
//				System.out.println(cur.val);
				curList.add(cur.val);
				if(cur.left!=null) {
					q.add(cur.left);
//					curList.add(cur.left.val);
				}
				if(cur.right!=null) {
					q.add(cur.right);
//					curList.add(cur.right.val);
				}
			}
			arr.add(curList);	
		}
		return arr;
	}
	
	static void printLinkedLists(ArrayList<LinkedList<Integer>> arr) {
		for(LinkedList<Integer> cur : arr) {
			System.out.println(cur);
		}
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(10);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(20);
		root.left.right = new TreeNode(25);
		root.right.left = new TreeNode(30);
		root.right.right = new TreeNode(35);
		ArrayList<LinkedList<Integer>> res = createLinkedList(root);
		printLinkedLists(res);
	}
}

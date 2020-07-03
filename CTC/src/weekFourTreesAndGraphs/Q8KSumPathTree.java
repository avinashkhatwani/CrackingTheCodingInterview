package weekFourTreesAndGraphs;

import java.util.ArrayList;

public class Q8KSumPathTree {

	
	
	public static void main(String args[]) 
	{  
		/* constructing the following Binary tree 
		 * 
		 *         Root of below binary tree:
				           1
				        /     \
				      3        -1
				    /   \     /   \
				   2     1   4     5                        
				        /   / \     \                    
				       1   1   2     2  
				       
				       
		 * 
		 * */
	    Node root = new Node(1);  
	    root.left = new Node(3);  
	    root.left.left = new Node(2);  
	    root.left.right = new Node(1);  
	    root.left.right.left = new Node(1);  
	    root.right = new Node(-1);  
	    root.right.left = new Node(4);  
	    root.right.left.left = new Node(1);  
	    root.right.left.right = new Node(2);  
	    root.right.right = new Node(5);  
	    root.right.right.right = new Node(2);  
	  
	    int k = 5;  
	    printKPath(root, k);  
	}

	private static void printKPath(Node root, int k) {
		if(root == null)
			return;
		ArrayList<Integer> arr = new ArrayList<>();
		checkPath(root, k, arr, 0);
		printKPath(root.left, k);
		printKPath(root.right, k);
		
	}

	private static void checkPath(Node root, int k, ArrayList<Integer> arr, int sum) {
		if(root == null)
			return;
		arr.add(root.val);
		sum = sum+root.val;
		if(sum==k)
			System.out.println(arr + " sum = "+sum);
		checkPath(root.left, k, arr, sum);
		checkPath(root.right, k, arr, sum);
		sum-=root.val;
		arr.remove(arr.size()-1);
		
	} 
}

/* Given a sorted (increasing order) array, write an algorithm to create a binary tree
 with minimal height. */

package weekFourTreesAndGraphs;

public class Q3 {
	
	static TreeNode createBinary(int[] arr, int l, int r) {
		if(l>=r)
			return null;
		int mid = l+(r-l)/2;
//		System.out.printf("left = %d Right = %d mid = %d",l,r,mid);
//		System.out.println();
		
		TreeNode curRoot = new TreeNode(arr[mid]);
		curRoot.left  = createBinary(arr, l, mid);
		curRoot.right = createBinary(arr, mid+1, r);
		
		return curRoot;
	}
	
	static void printTree(TreeNode root) {
		if(root == null)
			return;
		printTree(root.left);
		if(root.val != 0)
			System.out.println(root.val);
		printTree(root.right);
	}

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		TreeNode root = new TreeNode();
		root = createBinary(array, 0, array.length);
//		System.out.println(root.left.left.right.val);
		printTree(root);
	}
}

package weekFourTreesAndGraphs;

public class Q1CheckIfTreeisBalanced {
	TreeNode root;
	static boolean balance = true;
	
	

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
				/* Constructed binary tree is 
		        1 
		      /   \ 
		     2      3 
		   /  \    / 
		 4     5  6 
		 / 
		7         */
		Q1CheckIfTreeisBalanced tree = new Q1CheckIfTreeisBalanced(); 
		tree.root = new TreeNode(1); 
		tree.root.left = new TreeNode(2); 
		tree.root.right = new TreeNode(3); 
		tree.root.left.left = new TreeNode(4); 
		tree.root.left.right = new TreeNode(5); 
		tree.root.right.right = new TreeNode(6); 
		tree.root.left.left.left = new TreeNode(7);
//		tree.root.left.left.left.left = new TreeNode(8);
		
		tree.isBalanced(tree.root);
		if(balance)
            System.out.println("Tree is balanced"); 
        else
            System.out.println("Tree is not balanced"); 
		
	}

	private int isBalanced(TreeNode root) {
		if(root == null)
			return 0;
		
		int left = isBalanced(root.left);
		int right = isBalanced(root.right);
		
		if(Math.abs(left-right)>=2)
			balance=false;
		if(left>right)
			return left+1;
		return right+1;
	}
}

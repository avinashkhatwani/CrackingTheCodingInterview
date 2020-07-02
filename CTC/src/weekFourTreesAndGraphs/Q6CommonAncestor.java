package weekFourTreesAndGraphs;

class Q6BinaryTree {
	TreeNode root = new TreeNode();
	public TreeNode findLCA(TreeNode root, int x, int y) {
		if(root == null) {
			return null;
		}
		
		if(root.val == x || root.val == y)
			return root;
		TreeNode lLca = findLCA(root.left, x, y);
		TreeNode rLca = findLCA(root.right, x, y);
		
		if(lLca!=null && rLca!=null)
		{
			return root;
		}
		
		return (lLca != null) ? lLca : rLca;
		
	}
	
}

public class Q6CommonAncestor {

	public static void main(String[] args) {
		Q6BinaryTree tree = new Q6BinaryTree();
		tree.root = new TreeNode(1); 
		tree.root.left = new TreeNode(2); 
		tree.root.right = new TreeNode(3); 
		tree.root.left.left = new TreeNode(4); 
		tree.root.left.right = new TreeNode(5); 
		tree.root.right.left = new TreeNode(6);
		tree.root.right.right = new TreeNode(7);
		
		/*  Current Tree      
		 * 
		 * 		1
		 * 	   / \
		 * 	  2	  3
		 *   / \ / \
		 *  4  5 6  7
		 * 
		 * 	
		 * */
		
        System.out.println("LCA(4, 5): " + tree.findLCA(tree.root,4,5).val); 
        System.out.println("LCA(4, 6): " + tree.findLCA(tree.root,4,6).val); 
        System.out.println("LCA(3, 4): " + tree.findLCA(tree.root,3,4).val); 
        System.out.println("LCA(2, 4): " + tree.findLCA(tree.root,2,4).val); 
	}
	
}

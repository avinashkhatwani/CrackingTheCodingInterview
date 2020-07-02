/*  You have two very large binary trees: T1, with millions of nodes, 
 * and T2, with hundreds of nodes. Create an algorithm to decide if T2 is a subtree of T1.  */

package weekFourTreesAndGraphs;

class Q7BinaryTree{
	TreeNode root1 = null;
	TreeNode root2 = null;
	
	
	public boolean isSubtree(TreeNode root1, TreeNode root2) {
		if(root1 == null)
			return false;
		boolean ans = false;
		if(root1.val == root2.val) {
			ans = isCurSubtree(root1, root2);
			System.out.println("at "+root1.val+" it is "+ans);
			return ans;
		}
		
		return(isSubtree(root1.left, root2) || isSubtree(root1.right, root2));
	}
	
	public boolean isCurSubtree(TreeNode root1, TreeNode root2) {
		
		if(root1 == null && root2 == null)
			return true;
		if(root1 != null && root2 == null)
			return true;
		if(root1 == null && root2 != null)
			return false;
		if(root1.val != root2.val)
			return false;
		boolean l = isCurSubtree(root1.left, root2.left);
		boolean r = isCurSubtree(root1.right, root2.right);
		return l&&r;
		
	}
	
	
}
public class Q7CheckIfSubTree {

	public static void main(String[] args) {
		
		Q7BinaryTree tree = new Q7BinaryTree(); 
        
        // TREE 1 
        /* Construct the following tree 
              26 
             /   \ 
            10     3 
           /    \     \ 
          4      6      3 
           \ 	  \
           30      7*/
            
        tree.root1 = new TreeNode(26); 
        tree.root1.right = new TreeNode(3); 
        tree.root1.right.right = new TreeNode(3); 
        tree.root1.left = new TreeNode(10); 
        tree.root1.left.left = new TreeNode(4); 
        tree.root1.left.left.right = new TreeNode(30); 
        tree.root1.left.right = new TreeNode(6);
        tree.root1.left.right.right = new TreeNode(7);
        
        // TREE 2 
        /* Construct the following tree 
           10 
         /    \ 
         4      6 
          \ 
          30  */
        
        tree.root2 = new TreeNode(10); 
        tree.root2.right = new TreeNode(6); 
        tree.root2.left = new TreeNode(4); 
        tree.root2.left.right = new TreeNode(30);
        
        if (tree.isSubtree(tree.root1, tree.root2)) 
            System.out.println("Tree 2 is subtree of Tree 1 "); 
        else
            System.out.println("Tree 2 is not a subtree of Tree 1"); 
	}
}

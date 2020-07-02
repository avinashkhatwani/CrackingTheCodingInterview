package weekFourTreesAndGraphs;


class Node{
	int val;
	Node left, right, parent;
	Node(int value){
		val = value;
		left = right = parent=null;
	}
}

class BinaryTree{

	void printTree(Node root) {
		if(root == null)
			return;
		printTree(root.left);
		System.out.println(root.val);
		printTree(root.right);
	}
	
	public Node insert(Node root, int val) {
		
		if(root == null)
			return (new Node(val));
		else {
			Node temp = null;
			if(val <= root.val) {
				temp = insert(root.left, val);
				root.left = temp;
				temp.parent = root;
			}
			else {
				temp = insert(root.right, val);
				root.right = temp;
				temp.parent = root;
			}
			
		}
		
		return root;
	}

	public Node inOrderSuccessor(Node root, Node temp) {
		Node cur = null;
		if(temp.right == null) {
			if(temp.parent == null)
				return null;
			cur = temp.parent;
			while(cur.parent != null) {
				Node parent = cur.parent;
				if(parent.left != null && parent.left == cur )
					return parent;
				cur = cur.parent;
			}
		}
		else {
			cur = temp.right;
			while(cur.left!=null)
			{
				cur = cur.left;
			}
		}
		
		return cur;
	}
	
	
	
}

public class Q5FindSuccessor {

	
	public static void main(String[] args) 
    { 
		
		/* 		Current Tree
		 * 			  20
					 *         
			        /   \              
			       8     22              
			     /  \                           
			    4   12
			       /  \
		 *        10  14
		 * 
		 * 
		 */
		
        BinaryTree tree = new BinaryTree(); 
        Node root = null, temp = null, suc = null, min = null; 
        root = tree.insert(root, 20);
        root = tree.insert(root, 8); 
        root = tree.insert(root, 22); 
        root = tree.insert(root, 4); 
        root = tree.insert(root, 12); 
        root = tree.insert(root, 10); 
        root = tree.insert(root, 14);
        
        
//        tree.printTree(root);
        
        temp = root.left; 
        System.out.println("Temp = "+temp.val);
        suc = tree.inOrderSuccessor(root, temp); 
        if (suc != null) { 
            System.out.println( 
                "Inorder successor of "
                + temp.val + " is " + suc.val); 
        } 
        else { 
            System.out.println( 
                "Inorder successor does not exist"); 
        } 
        
        
        temp = root.left.right.right; 
        System.out.println("Temp = "+temp.val);
        suc = tree.inOrderSuccessor(root, temp); 
        if (suc != null) { 
            System.out.println( 
                "Inorder successor of "
                + temp.val + " is " + suc.val); 
        } 
        else { 
            System.out.println( 
                "Inorder successor does not exist"); 
        } 
        
    } 
}

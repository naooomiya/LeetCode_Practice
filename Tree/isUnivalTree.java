package Tree;

import java.util.HashSet;
import java.util.Set;

/**
	965. Univalued Binary Tree
	
	Description :
	A binary tree is univalued if every node in the tree has the same value.
	Return true if and only if the given tree is univalued.
	
	Example 1:
	
			   1
		    /  |  \
		   1   1   1
		  / \    
		 1   1   
	
	Input: [1,1,1,1,1,null,1]
	Output: true
	
	Example 2:
	
			   2
		    /  |  \
		   2   2   2
		  / \    
		 5   2  
	
	Input: [2,2,2,5,2]
	Output: false
	
	Note:
	The number of nodes in the given tree will be in the range [1, 100].
	Each node's value will be an integer in the range [0, 99].
	
 * */

public class isUnivalTree {
	//Definition for a binary tree node.
	public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	}
	
	Set<Integer> valsSet;
    public boolean is_UnivalTree(TreeNode root) {
        valsSet = new HashSet<Integer>(); 
    	dfs(root);
        
    	return valsSet.size() == 1;
    }
    
    private void dfs(TreeNode root)
    {
    	if (root != null)
    	{
    		valsSet.add(root.val);
    		dfs(root.left);
    		dfs(root.right);
    	}
    }
}


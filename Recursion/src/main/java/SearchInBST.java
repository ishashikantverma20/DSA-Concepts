/**
 * You are given the root of a binary search tree (BST) and an integer val.
 *
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node.
 * If such a node does not exist, return null.
 *                   4
 *              2       7
 *           1   3
 *
 *     Input: root = [4,2,7,1,3], val = 2
 *     Output: [2,1,3]
 */
public class SearchInBST {

	public TreeNode searchBST(TreeNode root, int val) {
		//base call
		if(root == null || root.val == val) {
			return root;
		}

		if(val > root.val) {
			// right side
			return searchBST(root.right, val);
		} else {
			// left side
			return searchBST(root.left, val);
		}


	}
}

 class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

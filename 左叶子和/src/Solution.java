import javax.swing.tree.TreeNode;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }

    public int sumOfLeftLeaves(TreeNode root) {
        int num=0;
        if(root!=null)
            num=add_left(root,2,0);
        return num;
    }

    public int add_left(TreeNode node,int i,int num){

        if(i==0&&node.left==null&&node.right==null)
            num+=node.val;
        if(node.left!=null)
            num=add_left(node.left,0,num);
        if(node.right!=null)
            num=add_left(node.right,1,num);

        return num;
        }
}

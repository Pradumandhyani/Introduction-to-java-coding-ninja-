package binaryTrees;

public class maximumDepth {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val,TreeNode left ,TreeNode right){
            this.val=val;
            this.left=left;
            this.right=right;
        }

    }
    class solution{
        public int maxDept(TreeNode root){
            if(root==null){
                return 0;
            }
            int left=maxDept(root.left);
            int right =maxDept(root.right);
            return left>right?left+1:right+1;
        }
    }
}

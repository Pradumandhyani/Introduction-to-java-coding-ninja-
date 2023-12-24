public class subTree {
    public class TreeNode {
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
    public class soltion{ 
    public boolean isSubTree(TreeNode root,TreeNode subRoot){
        if(root==null){
            return false;
        }
        if(subRoot==null){
            return true;
        }
        if(isSame(root,subRoot)){
            return true;
        }
        return isSubTree(root.left, subRoot)|| isSubTree(root.right, subRoot);
    }
    public boolean isSame(TreeNode root,TreeNode subRoot){
        if(root==null || subRoot==null){
            // ye check krra h agar root null hogai aur subroot bi null hogai too ye true
             //dega warna koi ek null h aur dusri ni h too false 
            return root==subRoot;
        }
        return root.val==subRoot.val && isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
    }
}}

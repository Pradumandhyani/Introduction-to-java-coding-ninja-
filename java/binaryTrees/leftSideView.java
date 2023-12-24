package binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class leftSideView {
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
    public class solution{
        public List<Integer> leftSideview(TreeNode root){
            List<Integer>result=new ArrayList<>();
            leftView(root,result,0);
            return result;
        }
        public void leftView(TreeNode root,List<Integer>ans,int currHeight){
            if(root==null){
                return;
            }
            if(ans.size()==currHeight){
                ans.add(root.val);
            }

            leftView(root.left, ans, currHeight+1);
            leftView(root.right, ans, currHeight+1);
        }
    }
}

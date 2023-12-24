package binaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
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
  }
  public class solution {
    public List<List<Integer>> Level(TreeNode root){
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>q=new  LinkedList<>();
        q.add(root);
        while(q.size()>0){
            List<Integer>arr=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode a=q.remove();
                arr.add(a.val);
                if(a.left!=null){
                    arr.add(a.left.val);
                }
                if(a.right!=null){
                    arr.add(a.right.val);
                }

            }
            result.add(arr);

        }
        return result;

    }}
}

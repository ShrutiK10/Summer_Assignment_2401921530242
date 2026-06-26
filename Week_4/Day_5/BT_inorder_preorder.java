package Week_4.Day_5;
import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}

public class BT_inorder_preorder {

    static int preIndex=0;

    static HashMap<Integer,Integer> map =
            new HashMap<>();

    public static TreeNode buildTree(
            int[] preorder,
            int[] inorder){

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return build(preorder,0,inorder.length-1);
    }

    public static TreeNode build(
            int[] preorder,
            int left,
            int right){

        if(left>right){
            return null;
        }

        TreeNode root =
            new TreeNode(preorder[preIndex++]);

        int mid=map.get(root.val);

        root.left=
            build(preorder,left,mid-1);

        root.right=
            build(preorder,mid+1,right);

        return root;
    }

    public static void inorderPrint(TreeNode root){

        if(root==null){
            return;
        }

        inorderPrint(root.left);
        System.out.print(root.val+" ");
        inorderPrint(root.right);
    }

    public static void main(String[] args){

        int preorder[]={3,9,20,15,7};

        int inorder[]={9,3,15,20,7};

        TreeNode root = buildTree(preorder,inorder);

        inorderPrint(root);
    }
}

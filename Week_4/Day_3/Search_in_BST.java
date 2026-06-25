package Week_4.Day_3;
import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Search_in_BST {

    public static TreeNode searchBST(TreeNode root, int val) {

        while(root != null) {

            if(root.val == val) {
                return root;
            }

            if(val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        TreeNode ans = searchBST(root, 3);

        if(ans != null) {
            System.out.println(ans.val);
        } else {
            System.out.println("Not Found");
        }
    }
}
    


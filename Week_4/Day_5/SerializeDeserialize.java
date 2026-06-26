package Week_4.Day_5;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SerializeDeserialize {

    static int index = 0;

    // Serialize
    public static String serialize(TreeNode root) {

        StringBuilder sb = new StringBuilder();

        helper(root, sb);

        return sb.toString();
    }

    public static void helper(TreeNode root, StringBuilder sb) {

        if (root == null) {
            sb.append("N,");
            return;
        }

        sb.append(root.val).append(",");

        helper(root.left, sb);

        helper(root.right, sb);
    }

    // Deserialize
    public static TreeNode deserialize(String data) {

        String[] arr = data.split(",");

        index = 0;

        return build(arr);
    }

    public static TreeNode build(String[] arr) {

        if (arr[index].equals("N")) {
            index++;
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(arr[index]));

        index++;

        root.left = build(arr);

        root.right = build(arr);

        return root;
    }

    // Inorder Traversal (Verification)
    public static void inorder(TreeNode root) {

        if (root == null) {
            return;
        }

        inorder(root.left);

        System.out.print(root.val + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);

        root.right = new TreeNode(3);

        root.right.left = new TreeNode(4);

        root.right.right = new TreeNode(5);

        // Serialize
        String data = serialize(root);

        System.out.println("Serialized String:");
        System.out.println(data);

        // Deserialize
        TreeNode newRoot = deserialize(data);

        System.out.println("\nInorder Traversal after Deserialization:");

        inorder(newRoot);
    }
}

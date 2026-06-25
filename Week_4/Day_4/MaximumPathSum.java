package Week_4.Day_4;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaximumPathSum {

    static int maxSum = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {

        dfs(root);

        return maxSum;
    }

    public static int dfs(TreeNode root) {

        if(root == null) {
            return 0;
        }

        int left = Math.max(0,
                            dfs(root.left));

        int right = Math.max(0,
                             dfs(root.right));

        maxSum = Math.max(
                    maxSum,
                    left + right + root.val);

        return root.val +
               Math.max(left,right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);

        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);

        root.right.right = new TreeNode(7);

        System.out.println(
                maxPathSum(root));
    }
}

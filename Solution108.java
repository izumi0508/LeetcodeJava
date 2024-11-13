public class Solution108 {
    public static void main(String[] args) {
        Solution108 bst = new Solution108();
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = bst.sortedArrayToBST(nums);
        System.out.println("Inorder Traversal of BST:");
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;  // 基本情況：如果邊界不合法，返回 null
        }

        int mid = left + (right - left) / 2;  // 獲取中間索引
        TreeNode node = new TreeNode(nums[mid]);  // 創建新節點

        // 遞迴地建立左子樹和右子樹
        node.left = buildTree(nums, left, mid - 1);
        node.right = buildTree(nums, mid + 1, right);

        return node;  // 返回創建的節點
    }

}

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePathsHelper(root, "", paths);
        return paths;
    }

    private void binaryTreePathsHelper(TreeNode root, String path, List<String> paths) {
        if (root.left == null && root.right == null) {
            paths.add(path + root.val);
            return;
        }

        path = path + root.val + "->";
        if (root.left != null) binaryTreePathsHelper(root.left, path, paths);
        if (root.right != null) binaryTreePathsHelper(root.right, path, paths);
    }
}
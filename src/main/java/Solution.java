import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        binaryTreePathsHelper(root, new StringBuilder(), paths);
        return paths;
    }

    private void binaryTreePathsHelper(TreeNode root, StringBuilder path, List<String> paths) {
        int pathLength = path.length();
        path.append(root.val);

        if (root.left == null && root.right == null) {
            paths.add(path.toString());
        } else {
            path.append("->");
            if (root.left != null) binaryTreePathsHelper(root.left, path, paths);
            if (root.right != null) binaryTreePathsHelper(root.right, path, paths);
        }

        path.setLength(pathLength);
    }
}
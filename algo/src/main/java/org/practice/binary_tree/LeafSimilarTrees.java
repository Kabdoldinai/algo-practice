package org.practice.binary_tree;

import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees<T> {

    public boolean leafSimilar(TreeNode<T> root1, TreeNode<T> root2) {
        List<T> leaves1 = new ArrayList<>();
        List<T> leaves2 = new ArrayList<>();

        dfs(root1, leaves1);
        dfs(root2, leaves2);

        return leaves1.equals(leaves2);
    }

    private void dfs(TreeNode<T> node, List<T> list) {
        if (node == null) return;

        if (node.left == null && node.right == null) {
            list.add(node.val);
        }

        dfs(node.left, list);
        dfs(node.right, list);
    }

}

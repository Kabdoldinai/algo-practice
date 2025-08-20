package binary_tree_dfs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.practice.binary_tree.LeafSimilarTrees;
import org.practice.binary_tree.TreeNode;


class LeafSimilarTreesTest {

    private LeafSimilarTrees leafSimilarTrees;

    @BeforeEach
    void onSetUp() {
        this.leafSimilarTrees = new LeafSimilarTrees();
    }


    @Test
    @SuppressWarnings(value = "")
    void shouldReturnTrueWhenGivenTwoTreesWithSameSequence() {
        Integer[] arr1 = {3,5,1,6,2,9,8,null,null,7,4};
        Integer[] arr2 = {3,5,1,6,7,4,2,null,null,null,null,null,null,9,8};

        TreeNode<Integer> root1 = TreeNode.buildTree(arr1);
        TreeNode<Integer> root2 = TreeNode.buildTree(arr2);

        Assertions.assertTrue(leafSimilarTrees.leafSimilar(root1, root2));
    }

}

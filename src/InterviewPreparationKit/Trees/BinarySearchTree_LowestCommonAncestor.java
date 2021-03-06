package InterviewPreparationKit.Trees;

public class BinarySearchTree_LowestCommonAncestor {

    public static Node lca(Node root, int v1, int v2) {
        if (root.data >= Math.min(v1, v2) && root.data <= Math.max(v1, v2)) {
            return root;
        } else if (root.data > v1 && root.data > v2){
            return lca(root.left, v1, v2);
        } else {
            return lca(root.right, v1, v2);
        }
    }
}

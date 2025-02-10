public class BinaryTreeLeft extends BinaryTree {

    public BinaryTreeLeft(int[] arr) {
        super(arr);
    }

    @Override
    public void traversalTree() {
        traversalTree(root);
    }

    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.left());
        System.out.println(node.value());
        traversalTree(node.right());
    }
}

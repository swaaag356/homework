public class BinaryTreeRight extends BinaryTree {


     public BinaryTreeRight(int[] arr) {
        super(arr);
     }

    @Override
    public void traversalTree() {
        traversalTree(root);
    }

    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        System.out.println(node.value());
        traversalTree(node.right());
        traversalTree(node.left());
    }
}

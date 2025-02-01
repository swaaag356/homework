public class BinaryTreeRight extends BinaryTree {


    @Override
    public void traversalTree(Node node) {
        if (node == null) return;
        traversalTree(node.right());
        System.out.println(node.value());
        traversalTree(node.left());
    }
}

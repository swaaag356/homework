public abstract class BinaryTree {

    public abstract void traversalTree(Node node);

    public void addLeaf(int n, Node node) {
        if (n > node.value()) {
            if (node.right() == null) {
                Node rightNode = new Node(n);
                node.setRight(rightNode);
                return;
            } else {
                addLeaf(n, node.right());
            }
        } else {
            if (node.left() == null) {
                Node rightNode = new Node(n);
                node.setLeft(rightNode);
                return;
            } else {
                addLeaf(n, node.left());
            }
        }
    }
}

public abstract class BinaryTree {
    public Node root;

    public BinaryTree(int[] arr) {
        root = new Node(arr[0]);
        for (int i = 1; i < arr.length; i++){
            this.addLeaf(arr[i], root);
        }
    }

    public abstract void traversalTree();

    public abstract void traversalTree(Node node);

    public void addLeaf(int n, Node node) {
        if (n > node.value()) {
            if (node.right() == null) {
                Node rightNode = new Node(n);
                node.setRight(rightNode);
            } else {
                addLeaf(n, node.right());
            }
        } else {
            if (node.left() == null) {
                Node rightNode = new Node(n);
                node.setLeft(rightNode);
            } else {
                addLeaf(n, node.left());
            }
        }
    }
}

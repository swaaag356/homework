public class BinaryTreeCenter extends BinaryTree {


    public BinaryTreeCenter(int[] arr) {
        super(arr);
    }

    @Override
    public void traversalTree() {
        traversalTree(root);
    }

    @Override
    public void traversalTree(Node node){
        if (node == null) return;
        traversalTree(node.left());
        traversalTree(node.right());
        System.out.println(node.value());
    }

}

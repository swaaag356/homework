import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(100);
        }
        Node root = new Node(arr[0]);
        BinaryTreeCenter binaryTreeCenter = new BinaryTreeCenter();

        for (int i = 1; i < arr.length; i++){
            binaryTreeCenter.addLeaf(arr[i], root);
        }


        binaryTreeCenter.traversalTree(root);

    }
}

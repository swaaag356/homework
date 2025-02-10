import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++){
            arr[i] = r.nextInt(10);
        }

        BinaryTreeCenter binaryTreeCenter = new BinaryTreeCenter(arr);
        BinaryTreeLeft binaryTreeLeft = new BinaryTreeLeft(arr);
        BinaryTreeRight binaryTreeRight = new BinaryTreeRight(arr);


        binaryTreeCenter.traversalTree();
        System.out.println("-------------------------------");
        binaryTreeLeft.traversalTree();
        System.out.println("--------------------------------");
        binaryTreeRight.traversalTree();

    }
}

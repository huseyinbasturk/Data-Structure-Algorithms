package Trees;

public class TreeApp {

    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for(int i = 0; i < 11; i++){
            tree.insert(numbers[i]);
        }
        //visualize tree.printTree
     /*   System.out.println("Pre order traversal");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("In order traversal");
        tree.inOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Post order traversal");
        tree.postOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level order traversal");
        tree.levelOrderTraversal();*/

       // System.out.println(tree.contains(89));

        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println("Number of leaves: " + tree.countLeaves(tree.root));
        System.out.println("Sum of leaves: " + tree.findSumOfLeaves(tree.root));
        System.out.println("Height of tree: " + tree.height(tree.root));
        System.out.println("Sum of Node Depth is: " + tree.calculateNodeDepthsSums());
        System.out.println("Sum of nodes: " + tree.calculateNodeSums());
    }
}

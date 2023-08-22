package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {
    }

    void insert(int value){
        TNode newNode = new TNode(value);
        if(root == null) {
            root = newNode;
            return;
        }
        TNode current = root;
        while(true){
            if(value <= current.value){
                //if left is null insert here
                if(current.leftChild==null){
                    current.leftChild=newNode;
                    break;
                }
               // if leftChild is not null branch into left subtree
                current = current.leftChild;
            } else {
                if(current.rightChild==null){
                    //if right is null insert here
                    current.rightChild = newNode;
                    break;
                }
                // if rightChild is not null branch into left subtree
                current=current.rightChild;
            }

        }
    }

    //PreOrder Traversal of the tree
    //Root-Left-Right
    void preOrderTraversal(TNode root){
        if(root==null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    //InOrder Traversal of the tree
    //Left-Root-Right
    void inOrderTraversal(TNode root){
        if(root==null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);
    }

    //PostOrder Traversal of the tree
    //Left-Right-Root
    void postOrderTraversal(TNode root){
        if(root==null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");
    }


    void levelOrderTraversal(){
        if(root==null) return;
        Queue<TNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.print(toVisit.value + ", ");
            if(toVisit.leftChild!=null){
                queue.add(toVisit.leftChild);
            }
            if(toVisit.rightChild!=null){
                queue.add(toVisit.rightChild);
            }

        }
    }

    public boolean contains(int value){
        if(root==null) return false;
        TNode current=root;
        while (current!=null){
            if(value < current.value) current=current.leftChild;
            else if(value> current.value) current=current.rightChild;
            else return true;
        }
        return false;
    }

    public boolean isLeaf(TNode node){
        return node.leftChild==null && node.rightChild==null;
    }

    public void printLeaves(TNode root){
        if(root==null) return;
        //perform visit on root
        if(isLeaf(root)) System.out.print(root.value + ", ");
        //recursively branch left subtree
        printLeaves(root.leftChild);
        //recursively branch right subtree
        printLeaves(root.rightChild);

    }
    //int counter = 0;
    int countLeaves(TNode root){

       /* if(root==null) return 0;
        //perform visit on root
        if(isLeaf(root)) counter++;
        //recursively branch left subtree
        countLeaves(root.leftChild);
        //recursively branch right subtree
        countLeaves(root.rightChild);

        return counter;*/

        if(root==null) return 0;
        if(isLeaf(root)) return 1;
        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    int findSumOfLeaves(TNode root){
        if(root==null) return 0;
        if(isLeaf(root)) return root.value;
        return findSumOfLeaves(root.leftChild) + findSumOfLeaves(root.rightChild);
    }

    int height(TNode root){
        if(root==null) return -1;
        if(isLeaf(root)) return 0;
        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }
    //sum of node depths
    public int calculateNodeDepthsSums(){
        return nodeDepthsSums(root, 0);
    }

    public int nodeDepthsSums(TNode node, int A){
        if(node==null) return 0;
        return A+nodeDepthsSums(node.leftChild, A+1) + nodeDepthsSums(node.rightChild, A+1);

    }
    //sum of node sums
    public int calculateNodeSums(){
        return nodeSums(root, root.value);
    }
    //sum of node depths
    public int nodeSums(TNode node, int sum){
        if(node==null) return 0;
        return sum + nodeSums(node.leftChild, node.value) + nodeSums(node.rightChild, node.value);

    }
}

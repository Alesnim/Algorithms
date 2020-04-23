package Algorithms.DataStructures.BinarySearchTrees.BinarySearchTree;

import Algorithms.DataStructures.BinarySearchTrees.BinaryTree;
import Algorithms.DataStructures.BinarySearchTrees.Utility;

public class Tester {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinarySearchTree<>();
        Utility.createTree(tree, 10, 10);
        Utility.printInInorder(tree);
    }

}
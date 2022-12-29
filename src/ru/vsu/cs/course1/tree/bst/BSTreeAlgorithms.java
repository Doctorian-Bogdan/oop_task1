package ru.vsu.cs.course1.tree.bst;

import ru.vsu.cs.course1.tree.BinaryTree;

public class BSTreeAlgorithms {
    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = node.getValue().compareTo(value);
        if (cmp == 0) {
            return node;
        } else if (cmp > 0) {
            return getNode(node.getLeft(), value);
        } else {
            return getNode(node.getRight(), value);
        }
    }

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getMinNode(BinaryTree.TreeNode<T> node) {
        return (node == null || node.getLeft() == null) ? node : getMinNode(node.getLeft());
    }

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getMaxNode(BinaryTree.TreeNode<T> node) {
        return (node == null || node.getRight() == null) ? node : getMaxNode(node.getRight());
    }

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getFloorNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = value.compareTo(node.getValue());
        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return getFloorNode(node.getLeft(), value);
        } else {
            BinaryTree.TreeNode<T> res = getFloorNode(node.getRight(), value);
            return (res != null) ? res : node;
        }
    }

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getCeilingNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = value.compareTo(node.getValue());
        if (cmp == 0) {
            return node;
        } else if (cmp > 0) {
            return getCeilingNode(node.getRight(), value);
        } else {
            BinaryTree.TreeNode<T> res = getCeilingNode(node.getLeft(), value);
            return (res != null) ? res : node;
        }
    }
}

package ru.vsu.cs.course1.tree.bst;

import ru.vsu.cs.course1.tree.BinaryTree;


public interface BSTree<T extends Comparable<? super T>> extends BinaryTree<T> {

    default BinaryTree.TreeNode<T> getNode(T value) {
        return BSTreeAlgorithms.getNode(getRoot(), value);
    }

    default T get(T value) {
        BinaryTree.TreeNode<T> valueNode = getNode(value);
        return (valueNode == null) ? null : valueNode.getValue();
    }

    default boolean contains(T value) {
        return getNode(value) != null;
    }

    T put(T value);

    T remove(T value);

    void clear();

    int size();

    default BinaryTree.TreeNode<T> getMinNode() {
        return BSTreeAlgorithms.getMinNode(getRoot());
    }

    default T getMin() {
        BinaryTree.TreeNode<T> minNode = getMinNode();
        return (minNode == null) ? null : minNode.getValue();
    }

    default BinaryTree.TreeNode<T> getMaxNode() {
        return BSTreeAlgorithms.getMaxNode(getRoot());
    }

    default T getMax() {
        BinaryTree.TreeNode<T> minNode = getMinNode();
        return (minNode == null) ? null : minNode.getValue();
    }

    default BinaryTree.TreeNode<T> getFloorNode(T value) {
        return BSTreeAlgorithms.getFloorNode(getRoot(), value);
    }

    default T getFloor(T value) {
        BinaryTree.TreeNode<T> floorNode = getFloorNode(value);
        return (floorNode == null) ? null : floorNode.getValue();
    }

    default BinaryTree.TreeNode<T> getCeilingNode(T value) {
        return BSTreeAlgorithms.getCeilingNode(getRoot(), value);
    }

    default T getCeiling(T value) {
        BinaryTree.TreeNode<T> ceilingNode = getCeilingNode(value);
        return (ceilingNode == null) ? null : ceilingNode.getValue();
    }
}

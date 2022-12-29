package ru.vsu.cs.course1.tree;

import java.awt.Color;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public interface BinaryTree<T> extends Iterable<T> {

    interface TreeNode<T> extends Iterable<T> {

        T getValue();

        default TreeNode<T> getLeft() {
            return null;
        }

        default TreeNode<T> getRight() {
            return null;
        }

        default Color getColor() {
            return Color.BLACK;
        }

        @Override
        default Iterator<T> iterator() {
            return BinaryTreeAlgorithms.inOrderValues(this).iterator();
        }

        default String toBracketStr() {
            return BinaryTreeAlgorithms.toBracketStr(this);
        }
    }

    TreeNode<T> getRoot();

    @Override
    default Iterator<T> iterator() {
        return this.getRoot().iterator();
    }

    default String toBracketStr() {
        return this.getRoot().toBracketStr();
    }
}

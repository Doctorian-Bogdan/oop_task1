package ru.vsu.cs.course1.tree.bst.rb;

import ru.vsu.cs.course1.tree.bst.BSTreeMap;
import ru.vsu.cs.course1.tree.bst.BSTree;

public class RBTreeMap<K extends Comparable<K>, V> implements BSTreeMap<K, V> {

    private final BSTree<MapTreeEntry<K, V>> tree = new RBTree<>();

    @Override
    public BSTree<MapTreeEntry<K, V>> getTree() {
        return tree;
    }
}

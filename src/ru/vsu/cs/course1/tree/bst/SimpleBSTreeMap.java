package ru.vsu.cs.course1.tree.bst;


public class SimpleBSTreeMap<K extends Comparable<K>, V> implements BSTreeMap<K, V> {

    private final BSTree<MapTreeEntry<K, V>> tree = new SimpleBSTree<>();

    @Override
    public BSTree<MapTreeEntry<K, V>> getTree() {
        return tree;
    }
}

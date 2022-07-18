package com.HashMapAssignment;

public class MyHashMap<K, V> {
    MyLinkedList<K> myLinkedList;

    public MyHashMap(){
        this.myLinkedList = new MyLinkedList<>();
    }
    public V get(K key){
        com.HashMapAssignment.MyMapNode<K,V> myMapNode = (com.HashMapAssignment.MyMapNode<K,V>) this.myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();

    }
}

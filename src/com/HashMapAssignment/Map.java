package com.HashMapAssignment;
public class Map<K, V> {
    public int listSize = 14;
    HashNode<K, V> table[];

    public Map() {
        table = new HashNode[listSize];
    }

    /**
     * check for String and index value
     *
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        int hashIndex = key.hashCode() % listSize;
        HashNode<K, V> newNode = table[hashIndex];

        if (newNode == null) {
            table[hashIndex] = new HashNode<K, V>(key, value);
        } else {
            while (newNode.next != null) {
                if (newNode.getKey().equals(key)) {
                    newNode.setValue(value);
                    return;
                }
                newNode = newNode.next;
            }

            /**
             * check for new node
             */

            if (newNode.getKey().equals(key)) {

                newNode.setValue(value);
                return;
            }
            newNode.next = new HashNode<K, V>(key, value);
        }

    }
}


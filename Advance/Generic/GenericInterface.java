package Advance.Generic;

interface Pair<K, V> {
    K getKey();
    V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }    
}


public class GenericInterface {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair("One", 1);
        System.out.println("Key: " + p1.getKey() + ", Value: " + p1.getValue()); // Output: Key: One, Value: 1

        Pair<String, String> p2 = new OrderedPair("Project", "Sekai");
        System.out.println("Key: " + p2.getKey() + ", Value: " + p2.getValue()); // Output: Key: Hello, Value: World
    }
}
package data_structures.hashtables.custom;

public class HashTable {
    String[] data;

    public HashTable(int size) {
        this.data = new String[size];
    }

    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.data.length;
        }
        return hash;
    }

    public void set() {
        
    }

}

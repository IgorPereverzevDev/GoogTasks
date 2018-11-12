class MyHashMap {

    private static int SIZE;

    private Entry table[];

    private Entry e;


    class Entry {
        int key;
        int value;
        Entry next;

        Entry(int k, int v) {
            key = k;
            value = v;
        }

        int getValue() {
            return value;
        }

        void setValue(int value) {
            this.value = value;
        }

        int getKey() {
            return key;
        }
    }


    /**
     * Initialize your data structure here.
     */
    private MyHashMap() {
        SIZE = 66000;
        table = new Entry[SIZE];
    }

    /**
     * value will always be non-negative.
     */
    private void put(int key, int value) {
        e = table[key];
        if (e != null) {
            if (e.getKey() == key) {
                e.setValue(value);
            } else {
                while (e.next != null) {
                    e = e.next;
                }
                e.next = new Entry(key, value);
            }
        } else {
            table[key] = new Entry(key, value);
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        e = table[key];
        while (e != null) {
            if (e.getKey() == key) {
                return e.getValue();
            }
            e = e.next;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    private void remove(int key) {
        e = table[key];
        if (e != null) {
            table[key] = null;
        }
    }




    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.remove(95);
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.get(1);            // returns 1
        hashMap.get(3);            // returns -1 (not found)
        hashMap.put(2, 1);          // update the existing value
        hashMap.get(2);            // returns 1
        hashMap.remove(2);          // remove the mapping for 2
        hashMap.get(2);            // returns -1 (not found)

    }
}
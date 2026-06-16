import java.util.*;
    public class MyHashmap<K, V> {
        private Node<K, V>[] Buckets;
        private int N; 
        private int n; 

        @SuppressWarnings("unchecked")
        MyHashmap() {
            N = 2;
            Buckets = new Node[N];
            n = 0;
        }

        public int hashCode(K key) {
    int k = (Integer) key; 
    return Math.abs(k % N);
}

    private int hashFunction(K key) {
        return hashCode(key);  
    }


   
        private Node<K, V> searchNode(K key, int index) {
            Node<K, V> head = Buckets[index];
            while (head != null) {
                if (head.key.equals(key)) return head;
                head = head.next;
            }
            return null;
        }

        
        public void put(K key, V value) {
            int index = hashFunction(key);
            Node<K, V> existing = searchNode(key, index);

            if (existing == null) {
                Node<K, V> newNode = new Node<>(key, value);
                newNode.next = Buckets[index];
                Buckets[index] = newNode;
                n++;
            } else {
                existing.value = value; 
            }

            double loadFactor = (double) n / N;
            if (loadFactor > 2.0) {
                rehash();
            }
        }

        
        public V get(K key) {
            int index = hashFunction(key);
            Node<K, V> node = searchNode(key, index);
            if (node == null) {
                return null;
            } else {
                return node.value;
            }

        }

     
        public V remove(K key) {
            int index = hashFunction(key);
            Node<K, V> head = Buckets[index];
            Node<K, V> prev = null;

            while (head != null) {
                if (head.key.equals(key)) {
                    if (prev == null) Buckets[index] = head.next;
                    else prev.next = head.next;
                    n--;
                    return head.value;
                }
                prev = head;
                head = head.next;
            }
            return null;
        }

        
        public boolean isEmpty() {
            return n == 0;
        }

        
        @SuppressWarnings("unchecked")
        private void rehash() {
            Node<K, V>[] oldBuckets = Buckets;
            N = N * 2;
            Buckets = new Node[N];
            n = 0;

            for (Node<K, V> head : oldBuckets) {
                while (head != null) {
                    put(head.key, head.value);
                    head = head.next;
                }
            }
        }

        // Get all keys
        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (Node<K, V> head : Buckets) {
                while (head != null) {
                    keys.add(head.key);
                    head = head.next;
                }
            }
            return keys;
        }
    }

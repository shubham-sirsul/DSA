
import java.util.*;

public class implimentation {


 public class HashMap<K,V>{ // generics 
  public class Node{
      K key;
      V value;
     public Node(K key, V value){
        this.key =key;
        this.value = value;
     }
  }


  private  int n;
  private int N; // to save size of bucket 
  private LinkedList<Node> Buckets[] ; // actual table to store data 
  @SuppressWarnings("uncheaked")
  public HashMap(){
    this.N =4;
    this.Buckets = new LinkedList[N]; 
    for(int i= 0 ; i<4;i++){
        this.Buckets[i]= new LinkedList<>();
    }
  }

  private void rehash(){
    LinkedList<Node> Oldbucket[] = Buckets;
    Buckets = new LinkedList[N*2];
    for (int i =0;i<Oldbucket.length;i++){
        LinkedList<Node> ll =Oldbucket[i];
      for(int j =0;j<ll.size();j++){
        Node node = ll.get(j);
        put(node.key,node. value);
      }

    }

  }

  private int HashFunction(K Key){
     int bi = Key.hashCode(); // bi is in between 0 to N-1
    return Math.abs(bi) % N;

  }

  private int searchInLL(K key, int di){
     LinkedList<Node> ll =Buckets[di];
     for(int i  = 0; i<ll.size();i++){
        if(ll.get(i).key.equals(key)){
            return i;
        }
     }
     return -1;

  }

  public void put(K key,V value){
    int bi =HashFunction(key);
    int di = searchInLL(key,bi);

    if(di == -1){ // key not exists
     Buckets[bi].add(new Node(key,value)); 
     n++;
    }
    else{// key exists
    Node data =  Buckets[bi].get(di); // here new value of key 
    data.value = value; 

    }

    Double lambda =(double)n/N;

    if(lambda>2.0){
        rehash();
    }
  }

  public V get(K key){
    int bi =HashFunction(key);
    int di = searchInLL(key,bi);

    if(di == -1){ // key not exists
    return null;
    }
    else{// key exists
    Node data =  Buckets[bi].get(di); // here new value of key 
    return data.value; 

    }
  }

  public Boolean Containskey(K key){
    int bi =HashFunction(key);
    int di = searchInLL(key,bi);

    if(di == -1){ // key not exists
    return false;
    }
    else{// key exists
   return true;
  }
 }

  public V remove( K key){
    int bi =HashFunction(key);
    int di = searchInLL(key,bi);

    if(di == -1){ // key not exists
    return null;
    }
    else{// key exists
    Node data =  Buckets[bi].remove(di); // here new value of key 
    n--;
    return data.value; 

  }
  }


  public boolean isempty(){
    return n==0;

  }

  public ArrayList<K> keyset(){
       ArrayList<K> keys = new ArrayList<>();
       for(int i= 0;i<Buckets.length;i++){ // bi
        LinkedList<Node> ll = Buckets[i];
        for (int j = 0; j < ll.size(); j++) {// di
            keys.add(ll.get(j).key);
        }
       }
       return keys;
 }
 }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
implimentation outer = new implimentation(); // outer class object
HashMap<Integer, String> map = outer.new HashMap<>(); // create your custom HashMap
int choice = -1;

do {
    System.out.println("\n----- HASHMAP MENU -----");
    System.out.println("1. Insert PRN-Name");
    System.out.println("2. Search PRN");
    System.out.println("3. Delete PRN");
    System.out.println("4. Display All");
    System.out.println("5. Check if Empty");
    System.out.println("0. Exit");
    System.out.print("Enter your choice: ");

    if (!sc.hasNextInt()) {
        System.out.println(" Invalid input! Please enter a number.");
        sc.nextLine();
        continue;
    }

    choice = sc.nextInt();
    sc.nextLine(); // consume newline

    if (choice == 1) {
        int prn;
        System.out.print("Enter PRN: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid PRN (integer): ");
            sc.next();
        }
        prn = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Invalid name!");
        } else {
            map.put(prn, name);
            System.out.println("Inserted/Updated: PRN " + prn + " -> " + name);
        }
    }

    else if (choice == 2) {
        int prn;
        System.out.print("Enter PRN to search: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid PRN: ");
            sc.next();
        }
        prn = sc.nextInt();
        sc.nextLine();

        String name = map.get(prn);
        if (name != null) {
            System.out.println("Found: PRN " + prn + " -> " + name);
        } else {
            System.out.println("PRN not found!");
        }
    }

    else if (choice == 3) {
        int prn;
        System.out.print("Enter PRN to delete: ");
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input! Enter a valid PRN: ");
            sc.next();
        }
        prn = sc.nextInt();
        sc.nextLine();

        String removed = map.remove(prn);
        if (removed != null) {
            System.out.println("Deleted: PRN " + prn + " (" + removed + ")");
        } else {
            System.out.println("PRN not found!");
        }
    }

    else if (choice == 4) {
        ArrayList<Integer> keys = map.keyset();
        if (keys.isEmpty()) {
            System.out.println("\nHashMap is empty.");
        } else {
            System.out.println("\n--- HashMap Contents ---");
            for (Integer key : keys) {
                System.out.println("PRN: " + key + " -> Name: " + map.get(key));
            }
        }
    }

    else if (choice == 5) {
        System.out.println(map.isempty() ? "HashMap is empty." : "HashMap is not empty.");
    }

    else if (choice == 0) {
        System.out.println("Exiting...");
        break;
    }

    else {
        System.out.println("Invalid choice. Try again.");
    }

} while (choice != 0);


    }
}

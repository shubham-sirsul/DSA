
import java.util.*;

public class basics_hashset {
  public static void main(String[] args) {
      HashSet<Integer> hs = new HashSet<>();
      hs.add(2);
      System.out.println(hs.contains(3));
      hs.add(3);
      System.out.println(hs.size());
      hs.remove(3);
      System.out.println(hs.size());
      hs.add(5);
      System.out.println();
      for(Integer i : hs){
        System.out.println(i);
      }
      

  }
}
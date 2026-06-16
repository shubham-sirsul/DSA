
import java.util.ArrayList;
import java.util.Collections;

public class string_Sort_Arraylist {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(12);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
         // ReverseArraylist(list);
         System.out.println(list);
        Collections.sort(list); // inbuilt method  asending order 
        Collections.sort(list,Collections.reverseOrder());// decending order 

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("welcome ");
        l1.add("TO ");
        l1.add("Shubhs ");
        l1.add("Cinema ");
        System.out.println("OG " + l1);
        Collections.sort(l1); // asending order 
        //Collections.sort(l1,Collections.reverseOrder()); // desending order 
        System.out.println("Sorted"  + l1);

    
    }
}
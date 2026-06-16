
import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {
    public static void ReverseArraylist( ArrayList <Integer> list){
   int i =0,j=list.size()-1;
   while(i<j){

    // int temp =a ;
    // a=b;
    // b=temp;

   Integer temp = Integer.valueOf(list.get(i));
   list.set(i,list.get(j)) ;
   list.set(j, temp); 
    i++;
    j--;
   }
    System.out.println("Reversed list :");
   System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        Collections.reverse(list); // inbuilt method 
     // ReverseArraylist(list);
         System.out.println(list);
    }
}
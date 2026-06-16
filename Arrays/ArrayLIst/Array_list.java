
import java.util.ArrayList;




public class Array_list {
    public static void main(String[] args) {
        // array list are simlit to array but they are variable size
        // it is not compalsary to give array size at time of decalartion and  size of arrraylist can change at run time
        // ArrayList<Boolean> b1 =new ArrayList<>();
        ArrayList<Integer> l1 =new ArrayList<>();


        //add new element --> it work list list.append method in python 
        // new element at end of list 
        l1.add(5);
        l1.add(60);
        l1.add(34);
       



       // adding element at some index i
        l1.add(1,100); //--> add(index,element) --> no element delete in this pehele wala element age khiska 
        System.out.println(l1);



        // //get an element  at index i 
        // System.out.println(l1.get(1));
        

        // l1.size() returns number of elements in array 
        
        // //print with for loop 
        // for (int i = 0; i < l1.size(); i++) {
        //     System.out.print(l1.get(i)+" ");
        // }
        //  System.out.println();


        // printing array list directly 
        System.out.println(l1);

        

        // modyfing or updating a element at index i 
        l1.set(1, 50); //--> l1.set(index, element) 
        System.out.println(l1);

        // Removning at element at index i 
        l1.remove(3);// -->  l1.remove(index)
        System.out.println(l1);

        // removing an element e  but we dont know their index 
        System.out.println(l1.remove(Integer.valueOf(252))); // if element exists in Array list returns true else false 
        l1.remove(Integer.valueOf(50)); // if  given value not in array list it avoid it not gives error
        System.out.println(l1);

        // cheaking if element exists 
        boolean ans  = l1.contains(Integer.valueOf(5)); //cheak if element exists 
        System.out.println(ans);


        // if dont specify class , you can put anything inside l
        ArrayList l = new ArrayList();
        
        l.add("Shubhs");
        l.add(33);
        l.add(true);
        System.out.println(l);
    }
}
public class lexecographoival_Order {

    static String[] swap(String arr[], int i, int j) {
    String temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
}
        public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
        

    static void sortfruits(String  arr[]){
        for (int i = 0; i < arr.length -1; i++) {
             int min_idx =i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_idx])<0){
                    min_idx= j;
                }
                }
                if(min_idx!=i){
                swap(arr, i, min_idx);
            }
        }
    }
    public static void main(String[] args) {

        String fruits[] = {"kiwi","apple","watermalon","papaya","mango"};
        sortfruits(fruits);
        print(fruits);
        

    }
}
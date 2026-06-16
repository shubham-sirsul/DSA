public class PrintAllSubString {
    public static void main(String[] args) {
        String a ="abcd";
        System.out.println(a.substring(0,1));
        for (int i =0; i< a.length(); i++){
            for (int j = i+1; j < a.length()+1; j++) {
                System.out.print(a.     (i, j)+" "); // i included and j  excluded idx 
            }  
        }
    }
}
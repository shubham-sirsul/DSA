public class Builder {
    public static void main(String[] args) {
        // string builde like array list 
        // string builder are mutable 
        StringBuilder str = new StringBuilder("hellow");
        // str += "world"; // error not allowed in string builder 
        str.append("worls");
        System.out.println(str);

    }
}
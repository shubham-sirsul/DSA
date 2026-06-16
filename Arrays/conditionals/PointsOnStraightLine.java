public class PointsOnStraightLine{
    public static void main(String[] args) {
         double x1 = 1;
         double y1 = 1;
         double x2 = 2;
         double y2 = 2;
         double x3 = 3;
         double y3 = 4;
         if (((y2-y1)/(x2-x1)) == ((y3-y2)/(x3-x2))){
            System.out.println("the points is on straight line ");     
        }
        else{
            System.out.println("the points not on straight line");
        }
    }
}
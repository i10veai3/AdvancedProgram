public class Main{

    public static void main (String[] args){
        System.out.println(area(15.45));
        System.out.println(area(2,5));
        System.out.println(area(3,4,90));
    }

    public static double area(double r){
        return Math.PI * r * r;
    }
    public static int area(int x,int y){
        return x * y;
    }
    public static double area(double a,double b,double k){
        double h = Math.pow(a*a-b*b,2);
        double ans2 = a/2 ;
        return ans1*ans2;
    }
}
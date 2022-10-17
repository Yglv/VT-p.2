import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextInt(),b = in.nextInt(),h = in.nextInt();
        FindTangens(a,b,h);
        in.close();
    }
    public static void FindTangens(double a,double b,double step) {
        double i = a;
        while (i<=b) {
            System.out.printf("%f \n",Math.tan(i));
            i+=step;
        }
    }
}

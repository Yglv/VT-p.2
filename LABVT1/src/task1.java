import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(),y = in.nextDouble();
        double result = (1+Math.pow(Math.sin(x+y),2))/(2+Math.abs(x-2*x/(1+Math.pow(x,2)*Math.pow(y,2))))+2;
        System.out.print(result);
        in.close();
    }
}

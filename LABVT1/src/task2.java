import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(),y = in.nextDouble();
        boolean dotInSquare = false;
        if (((x>=-4) && (x<=4) && (y<=5) ) || ((x>=-6) && (x<=6) && (y<=0) && (y>=-3))){
            dotInSquare = true;
        }
        System.out.print(dotInSquare);
        in.close();
    }
}

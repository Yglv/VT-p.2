import java.util.Scanner;

public class task7 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        int arraySize = in.nextInt();
        double[] array = new double[arraySize];
        EnterArray(array);
        Sort(array);
        ShowArray(array);
    }
    public static void EnterArray(double[] array) {
        for (int i = 0;i < array.length;i++) {
            array[i] = in.nextDouble();
        }
    }
    public static void ShowArray(double[] array) {
        for (double elem : array) {
            System.out.printf("%.2f ",elem);
        }
    }
    public static void Sort(double[] array) {
        double temp = 0;
        int i = 0;
        while (i < array.length-1) {
            if (array[i] > array[i+1]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                i--;
            }
            i++;
        }
    }
}

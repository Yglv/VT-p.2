import java.util.Scanner;

public class task5 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Array size:");
        int arraySize = in.nextInt();
        int[] table = new int[arraySize];
        EnterArray(table);
        System.out.printf("Count of deleted numbers: %d",DeleteNumbers(table));
    }
    public static void EnterArray(int[] array) {
        for (int i = 0;i<array.length;i++) {
            array[i] = in.nextInt();
        }
    }
    public static int DeleteNumbers(int[] array) {
        int counter = 0;
        for (int i = 0;i<array.length-1;i++) {
            counter++;
        }
        return counter;
    }
}

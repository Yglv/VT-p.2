import java.util.Scanner;

public class task4 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Array size:");
        int arraySize = in.nextInt();
        int[] numbers = new int[arraySize];
        enterArray(arraySize,numbers);
        System.out.print("Indexes:");
        for (int i = 0;i<arraySize;i++) {
            if (isPrime(numbers[i])) {
                System.out.printf("%d ",i);
            }
        }
    }
    public static void enterArray(int size,int[] array) {
        for (int i=0;i<size;i++) {
            array[i] = in.nextInt();
        }
    }
    public static boolean isPrime(int number) {
        for (int i=2;i<number;i++) {
            if (number % i==0) {
                return false;
            }
        }
        return true;
    }
}

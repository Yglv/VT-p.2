import java.util.Scanner;

public class task8 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter array size: ");
        int arraySize = in.nextInt();
        double[] a = new double[arraySize],b = new double[arraySize];
        EnterArray(a);
        EnterArray(b);
        ShowResult(FindPlaces(a,b));
    }
    public static void EnterArray(double[] array) {
        for (int i = 0;i < array.length;i++) {
            array[i] = in.nextDouble();
        }
    }
    public static int[] FindPlaces(double[] arr1,double[] arr2){
        int i = 0,j = 0,k = -1;
        int[] result = new int[arr1.length];
        while ((i < arr1.length) && (j < arr2.length)){
            if (arr1[i] < arr2[j]){
                k = i++;
            }
            else{
                result[j++] = k;
            }
        }
        while (j < arr2.length){
            result[j++] = arr1.length - 1;
        }
        return result;
    }
    public static void ShowResult(int[] result){
        for (int i = 0;i < result.length;i++){
            if (result[i] == -1){
                System.out.printf("element b[%d] before a[0]\n",i);
            }
            else {
                System.out.printf("element b[%d] after a[%d]\n", i, result[i]);
            }
        }
    }
}

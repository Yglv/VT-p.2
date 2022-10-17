import java.util.Scanner;
import java.util.ArrayList;

public class task6 {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Array size:");
        int listSize = in.nextInt();
        ArrayList<Double> list = new ArrayList<Double>();
        EnterList(list,listSize);
        ShowList(list);
    }
    public static void EnterList(ArrayList<Double> list,int size) {
        int i = 0;
        while (i<size) {
            list.add(in.nextDouble());
            i++;
        }
    };
    public static void ShowList(ArrayList<Double> list) {
        for (int i = 0;i < list.size();i++) {
            for (int j = 0;j< list.size();j++) {
                System.out.printf("%.2f ",list.get(j));
            }
            list.add(list.get(0));
            list.remove(0);
            System.out.print("\n");
        }
    }
}

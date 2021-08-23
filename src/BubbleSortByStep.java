import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhập phần tử " + i + " : ");
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        System.out.println(Arrays.toString(list));
        System.out.println("\nĐang sắp xếp .........");
        bubbleSortByStep(list);
        System.out.println(Arrays.toString(list));
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    System.out.println("Đang đổi " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    System.out.print("Sau đổi : ");
                    System.out.println(Arrays.toString(list));
                    System.out.println("\n------------------");
                    needNextPass = true;
                }
            }

            if (needNextPass == false) {
                System.out.println("Mảng đã được sắp sếp.");
                break;
            }
            System.out.print("Mảng sau sắp xếp lần '" + k + "' : ");
            System.out.println(Arrays.toString(list));
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
    }
}
package BubbleSortByStep;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang");
        int size = scanner.nextInt();

        int[]arr = new int[size];
        System.out.println("Nhap " + arr.length + " gia tri cho mang ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang cua ban vua nhap ");
        for (int a:arr) {
            System.out.println(a);
        }
        bubbleSortByStep(arr);

    }
    public static void bubbleSortByStep(int[] arr){
        boolean needNextPass = true;
        for (int i = 1; i <arr.length && needNextPass ; i++) {
            needNextPass = false;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    System.out.println("Doi cho " +arr[j] + "cho " + arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    needNextPass = true;
                }
            }
            if(!needNextPass){
                System.out.println("Mang co the da duoc sap xep va khong can sap xep nua")  ;
                break;
            }
        }
        System.out.println("Mang sau khi sap xep: ");
        for (int a:arr) {
            System.out.println(a);
        }
        System.out.println( );
    }
}

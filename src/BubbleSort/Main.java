package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int [] arr = {9,6,8,3,7,-1,0};
        bubbleSort(arr);
        for (int a: arr) {
            System.out.println(a);

        }
    }
    public static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}

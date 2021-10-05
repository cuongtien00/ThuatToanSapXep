package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int[]arr = {1,7,5,8,3,0,2};
        selectionSort(arr);
        for (int a :arr) {
            System.out.println(a);

        }
    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i)
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
    }
}

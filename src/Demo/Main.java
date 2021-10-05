package Demo;

public class Main {
    public static void bubbleSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []arr= {7,3,6,54,-1,9};
        insertSort(arr);
        for (int a:arr)
              {
                  System.out.println(a);

        }
    }
    public static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i+1; j <arr.length ; j++) {
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }

        }
    }
    public static void insertSort(int[]arr){
        for (int i = 1; i <arr.length ; i++) {

            int currentElement = arr[i];
            int j;
            for (j = i-1; j >=0 && arr[j]>currentElement ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentElement;

        }
    }
}


package SelectionSort2;

public class Main {
    public static void main(String[] args) {
        int[]arr={5,6,8,4,0,43,9,3,2};
        selectionSort(arr);
        for (int a :arr ){
            System.out.println(a);

        }
    }
    public static void selectionSort(int[]arr){

        for (int i = 0; i < arr.length-1; i++) {
            int max = arr[i];
            int maxIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(max<arr[j]){
                    max = arr[j];
                    maxIndex = j;
                }
            }
            if(maxIndex!=i)
                arr[maxIndex] = arr[i];
                arr[i] = max;
        }
    }
}

package InsertSort;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,5,3,7,9,2,8};
        insertSort(arr);
        for (int a:arr
             ) {
            System.out.println(a);

        }
    }
    public static void insertSort(int[]arr){
        for (int i = 1; i <arr.length ; i++) {
            int currentE = arr[i];
            int j;
            for (j = i-1; j >=0 && arr[j]>currentE ; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentE;
        }
    }
}

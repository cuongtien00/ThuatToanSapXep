package InsertSort;

public class Main {
    public static void main(String[] args) {
        int [] arr = {1,5,3,7,9,2,8};
        System.out.println("Mang ban dau");
        for (int a:arr
        ) {
            System.out.println(a);

        }
        insertSort(arr);

    }
    public static void insertSort(int[]arr){
        for (int i = 1; i <arr.length ; i++) {
            int currentE = arr[i];
            int j;
            for (j = i-1; j >=0 && arr[j]>currentE ; j--) {
                System.out.println("Doi cho " + arr[j+1] + " voi " + arr[j]);
                arr[j+1] = arr[j];
            }
            arr[j+1] = currentE;
        }
        System.out.println("mang sau khi da sap xep: ");
        for (int a:arr
        ) {
            System.out.println(a);

        }
    }
}

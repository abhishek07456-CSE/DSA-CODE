public class InsertionSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void insertionSort(int arr[],int n){
         for(int i = 1 ; i < n ;i++){
            int t = arr[i];
            int j = i - 1;
            while(j>=0 && t > arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = t;
         }
     }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,7,9,11,22,34,67,98,24,56};
        int n = arr.length;
        insertionSort(arr,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));
    }
}

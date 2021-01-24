public class SelectionSort {
    static public void swap(int arr[] , int i , int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
     static public void selectionSort(int arr[],int n){
          for(int i=0;i<n-1;i++){
                int min = i;
                 for(int j = i+1;j<n;j++){
                     if(arr[j] < arr[min])
                       min = j;
                 }
                if(min != i)
                swap(arr,i,min);
          }
     }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,7,9,11,22,34,67,98,24,56};
        int n = arr.length;
        selectionSort(arr,n);
        long start = System.nanoTime();
        for(int i =0 ;i < n;i++){
            System.out.print(arr[i] + " ");
        }
        long end = System.nanoTime();
        System.out.print("\n" + (end-start));

    }
}

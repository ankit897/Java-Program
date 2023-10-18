import java.util.Arrays;
public class QuickSort {
    public static void main(String args[]) {
        int arr[]= {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.print(Arrays.toString(arr));

    }
    public static void sort(int arr[], int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);
            sort(arr , low, pivotIndex-1);
            sort(arr, pivotIndex+1,high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j = low ; j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i]= pivot;
        arr[high] = temp;
        return i;
    }

}
import java.util.Arrays;

public class Select {
    public static void select(int arr[]){
        for(int i =0;i<arr.length;i++){
            int last = arr.length-i-1;
            int index= MaxIndex(arr,0,last);
            swap(arr,index,last);
        }

    }
    public static int MaxIndex(int arr[], int start, int end){
        int max = start;
        for(int i =start;i<=end;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void swap(int arr[], int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        select(arr);
        System.out.print(Arrays.toString(arr));
    }

}

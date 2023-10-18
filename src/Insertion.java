import java.util.Arrays;

public class Insertion {
     public static void Insert(int arr[]){
         int i;
         int key = 0;
         for(int j =1;j<arr.length;j++){
             key = arr[j];
             i = j-1;
             while(i>=0 && arr[i]>key){
                 arr[i+1] = arr[i];
                 i = i -1;
             }
             arr[i+1] = key;
         }
     }
     public static void main(String args[]){
         int arr[] = {5,4,7,8,9,3,2,1};
         Insert(arr);
         System.out.print(Arrays.toString(arr));
     }


}

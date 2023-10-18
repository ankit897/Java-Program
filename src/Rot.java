import java.util.Arrays;

public class Rot {
    public static void main(String args[]){
       int arr[] = {5,3,2,1,8,9};
      int ans[] = Rot1(arr,3);
       System.out.print(Arrays.toString(ans));
    }
    public static int[] Rot1(int arr[], int k){
        int n = arr.length;
        int ans[] = new int[n];
        int j =0;
        for(int i = n-k;i<n;i++){
            ans[j] = arr[i];
            j++;
        }
        for(int i = 0;i<n-k;i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }

}

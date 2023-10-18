public class SecondLargest{

    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            if(smax<arr[i] && arr[i]<max){
                smax = arr[i];
                System.out.println(smax);
            }
        }
    }

}

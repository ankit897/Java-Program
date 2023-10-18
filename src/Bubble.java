import java.util.Arrays;

public class Bubble {
    public static void bubble(int arr[]){
        boolean vis;
        for(int i =0;i<arr.length;i++) {
            vis = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    vis = true;
                }
            }
            if (!vis) {
                break;
            }
        }

        }
        public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        System.out.print(Arrays.toString(arr));
        }
    }




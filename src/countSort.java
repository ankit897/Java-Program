import java.util.Scanner;
public class countSort {
    static int [] countS(int [] A, int max){
        int [] B = new int[A.length+1];
        int [] C = new int[max+1];
        for(int i=0; i<C.length;i++){
            C[i]=0;
        }
        for(int i=0; i<A.length; i++){
            C[A[i]]++;
        }
        for(int i=1; i<C.length; i++){
            C[i]=C[i]+C[i-1];
        }
        for(int i=0; i<A.length; i++){
            B[C[A[i]]]=A[i];
            C[A[i]]--;
        }
        return B;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = scan.nextInt();
        int [] Arr= new int[n];
        System.out.println("Enter the elememts of Array :");
        for(int i=0; i<n; i++){
            Arr[i]=scan.nextInt();

        }
        int max = Arr[0];
        for(int i=1; i<n; i++){
            if(Arr[i]>max){
                max = Arr[i];
            }
        }
        int [] D = new int [Arr.length+1];
        D = countS(Arr, max);
        for(int i=1; i<D.length; i++){
            System.out.print(D[i]+" ");
        }

    }
}

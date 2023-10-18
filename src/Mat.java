public class Mat {
    public static void main(String args[]) {
    int arr[] = {1,2,3,4};
    int n = arr.length;
    System.out.print( " Matrix Multiplications of numbers " +   Matrix(arr,1,n-1));
    }

    public static int Matrix(int p[], int i, int j) {
        if (i == j) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        for (int k = i; k < j; k++) {
            int count = Matrix(p, i, k) + Matrix(p, k + 1, j) + (p[i - 1] * p[k] * p[j]);
            if (count < min) {
                min = count;
            }
        }
        return min;
    }
}

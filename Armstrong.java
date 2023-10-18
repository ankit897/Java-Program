public class Armstrong {
    public static boolean arms(int n){
        if(n==0){
            return 0;
        }
        return arms(n/10)+(n%10)*(n%10)*(n%10);
    }

    public static void main(String[] args) {
        int num = 371;
    }
}

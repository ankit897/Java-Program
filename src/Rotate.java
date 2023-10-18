import java.util.Scanner;

public class Rotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp =n;
        int node = 0;
        while(temp>0){
            temp  = temp/10;
            node++;
        }
        k = k%node;
        if(k<0){
            k = k+node;
        }
        int mult =1;
        int div =1;
        for(int i =1;i<=node;i++){
            if(i<=k){
                mult = mult*10;
            }
            else{
                div = div*10;
            }
        }
        int q = n/mult;
        int r = n % mult;
        int rot = r*div+q;
        System.out.print(rot);


    }

}

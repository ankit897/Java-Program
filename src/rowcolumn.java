import java.util.Arrays;
public class rowcolumn {
    public static void main(String args[]){
        int mat[][] = {{10,20,30,40},
                {11,25,35,45} ,
                {28,29,37,49},
                {33,34,38,50}};
        System.out.println(Arrays.toString(search(mat,29)));

    }
    public static int[] search(int[][] mat,int target){
        int i = 0;
        int j = mat.length-1;
        while(i<mat.length && j>=0){
            if(mat[i][j]==target){
                return new int[]{i,j};
            } else if (mat[i][j] > target ){
                j--;
            }
            else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }

}

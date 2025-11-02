/*
  1 2 3 4 
   2 3 4 
    3 4 
     4 
 */





public class Reverse_Triangular_Number_Pyramid {
    public static void main(String args[]){
        int i, j, n=4;
        for(i=1; i<=n; i++){
            for(j=n; j>=n-i; j--){
                System.out.print(" ");
            }
            for(j=i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

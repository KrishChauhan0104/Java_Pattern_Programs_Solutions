/*
  1 2 3 4 
   2 3 4 
    3 4 
     4 
    3 4 
   2 3 4 
  1 2 3 4 
 */





public class Mirror_Image_Triangular_Pattern {

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
        for(i=1; i<=n-1; i++){
            for(j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(j=n-i; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
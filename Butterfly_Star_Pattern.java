/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */




public class Butterfly_Star_Pattern {
    public static void main(String args[]){
        int i, j, n=4;
        for(i=1; i<=n; i++){
            for(j=1; j<=2*n; j++){
                if(j>i && j<=2*n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(i=n; i>=1; i--){
            for(j=1; j<=2*n; j++){
                if(j>i && j<=2*n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

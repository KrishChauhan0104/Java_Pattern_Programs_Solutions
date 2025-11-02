/*
       * 
      * * 
     *   * 
    *     * 
   *       * 
  *         * 
 * * * * * * * 
 */

public class Hollow_Triangular_Pattern {
    public static void main(String args[]){
        int i, j, n=7;
        for(i=1; i<=n; i++){
            for(j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                if(i>2 && (j>1 && j<i) && i!=n){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }
}

/*
 * * * * * * * 
  *         * 
   *       * 
    *     * 
     *   * 
      * * 
       * 
 */



public class Hollow_Reverse_Triangular_Pattern {
    public static void main(String args[]){
        int i, j, n=7;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=n-i+1; j++){
                if((j>1 && j<n-i+1) && i>1  ){
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

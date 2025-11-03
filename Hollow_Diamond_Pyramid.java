/*
      * 
     * * 
    *   * 
   *     * 
  *       * 
 *         * 
  *       * 
   *     * 
    *   * 
     * * 
      * 
 */






public class Hollow_Diamond_Pyramid {
    public static void main(String args[]){
        int i, j, n=6;
        for(i=1; i<=n; i++){
            for(j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                if(i>2 && (j>1 && j<i)){
                    System.out.print("  ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for(i=n-1; i>=0; i--){
            for(j=i-1; j<n; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                if(i!=j && (j<i && j>1)){
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

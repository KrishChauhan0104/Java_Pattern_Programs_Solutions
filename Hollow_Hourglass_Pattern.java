/*
 * * * * * * 
  *       * 
   *     * 
    *   * 
     * * 
      * 
     * * 
    *   * 
   *     * 
  *       * 
 * * * * * * 
 */





public class Hollow_Hourglass_Pattern {

    public static void main(String args[]){
        int i, j, n=6;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(j=n; j>=i; j--){
                if(j<n && j>=i+1 && i>1){
                    System.out.print("  ");
                }
                else{
                     System.out.print("* ");
                }
               
            }
            System.out.println();
        }
        for(i=2; i<=n; i++){
            for(j=n+1; j>i; j--){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                if(i>2 && i<n && j>1 && j<i){
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
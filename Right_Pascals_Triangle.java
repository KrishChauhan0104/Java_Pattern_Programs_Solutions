/*
* 
* * 
* * * 
* * * * 
* * * 
* * 
* 
 */




public class Right_Pascals_Triangle {
    public static void main(String args[]){
        int n=4, i, j;
        for(i=1; i<=n; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=2; i<=n; i++){
            for(j=n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}

/*
    1 
   1 1 
  1 2 1 
 1 3 3 1 
 */





public class Pascals_Triangle {
    public static void main(String args[]){
        int i, j, n=4;
        for(i=1; i<=n; i++){
            for(j=n-i; j>=0; j--){
                System.out.print(" ");
            }
            int x=1;
            for(int k=1; k<=i; k++){
                System.out.print(x+" ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
}

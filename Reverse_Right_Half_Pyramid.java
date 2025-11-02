/*
*****
****
***
**
*
 */





public class Reverse_Right_Half_Pyramid {
    public static void main(String args[]){
        int i, j, n=5;
        for(i=0; i<n; i++){
            for(j=n; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

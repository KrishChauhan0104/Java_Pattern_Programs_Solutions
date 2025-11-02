/*
1 
2 3 
4 5 6 
7 8 9 10
 */







public class Number_Changing_Pyramid {
    public static void main(String args[]){
        int n=4;
        int c=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                c++;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

/*
1 
0 1 
1 0 1 
0 1 0 1 
 */








public class Zero_One_Triangle {
    public static void main(String args[]){
        int n=4;
        int c;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                c = (j+i+1)%2;
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

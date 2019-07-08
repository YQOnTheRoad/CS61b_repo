public class drawTriangle_1{
    public static void main(String[] args){
        int N=10;
        int i=1;
        for(i=1; i<=N; i++){
            int k=1;
            for(k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.print("\n\r");
        }
    }       
}

//public static void main(String[] args){
//    drawTriangle(10);
//}
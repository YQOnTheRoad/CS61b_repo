public class printMaxInArray{
    public static int max(int[] m){
        int k=m.length;
        int max=m[0];
        int i;
        for(i=1; i<k; i++){
            if (m[i]>max){
                max=m[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        System.out.println(max(numbers));
    }       
}   
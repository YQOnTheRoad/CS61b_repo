public class windowPosSum {
    public static void wps(int[] a, int n){
        for(int i=0; i<a.length; i++){
            if(a[i]<=0){
                continue;
            }
            for(int k=i+1; k<=i+n; k++){
                if(k>(a.length-1)){
                    break;
                }
                a[i]=a[i]+a[k];
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        wps(a, n);
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}
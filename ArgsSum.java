public class ArgsSum {
    public static void main(String[] args) {
        String[] numbers=args;
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum+=Integer.valueOf(numbers[i]);
        }
        System.out.println(sum);
    }
}
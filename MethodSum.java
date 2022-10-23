public class MethodSum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int sum = 0;
        for(int i=1;i<=100;i++)
            sum += i;
        return sum;
    }
}

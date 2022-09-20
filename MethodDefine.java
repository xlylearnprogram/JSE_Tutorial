public class MethodDefine{
    public static void main(String[] args) {
        sum(6,7);
        System.out.println("==========");
        System.out.println(sum(6,7));
        System.out.println("==========");
        int number = sum(16,17);
        System.out.println("变量的值："+number);
    }
    public static int sum(int a,int b){
        System.out.println("方法执行啦！");
        int result = a + b;
        return result;
    }
}

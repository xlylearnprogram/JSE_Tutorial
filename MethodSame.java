//判断两个数值是否相等
public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }
    public static boolean isSame(int a,int b){
        /*boolean same;
        if(a==b)
            same = true;
        else
            same = false;
        return same;*/
        /*boolean same = a == b ? true : false;*/
        //boolean same = a == b;
        return a == b;
    }
}

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));//字符串内容比较
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        String str4 = "hello";
        System.out.println(str1.equals(str4));

        System.out.println("===============");
        String str5 = "abc";//如果这行为null，则下面不推荐写法就会报错！
        System.out.println("abc".equals(str5));//推荐写法
        System.out.println(str5.equals("abc"));//不推荐写法

        System.out.println("================");
        String strA = "Java";
        String strB = "java";
        System.out.println(strA.equals(strB));//严格区分大小写，返回false
        System.out.println(strA.equalsIgnoreCase(strB));//忽略大小写。返回true
    }
}

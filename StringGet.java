/*
public int length():获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回值新的字符串。
public char charAt(int index):获取指定索引位置的单个字符。（索引从0开始。）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有，则返回-1值。
 */
public class StringGet {
    public static void main(String[] args) {
        int length = "suhvkdldaifjodsjmoks".length();
        System.out.println("字符串的长度是：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "world";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("================");

        //查找参数字符串在本来字符串当中出现的第一次索引位置
        //如果根本没有，返回-1值
        String str4 = "HelloWorld";
        int index = str4.indexOf("llo");//2
        System.out.println("第一次索引的位置是：" + index);
        System.out.println("HelloWorld".indexOf("abc"));//-1
        System.out.println("==================");

        String str5 = str4.substring(5);
        System.out.println(str5);
        String str6 = str4.substring(4,7);
        System.out.println(str6);
        System.out.println("====================");

        String strA = "aaa,bbb,ccc";
        String [] array = strA.split(",");
        for (int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
}

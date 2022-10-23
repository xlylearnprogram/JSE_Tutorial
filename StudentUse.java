public class StudentUse {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setAge(20);
        stu1.setName("迪丽热巴");
        System.out.println("姓名是："+stu1.getName()+",年龄是："+stu1.getAge());
        System.out.println("==============");

        Student stu2 = new Student("古力娜扎",21);
        System.out.println("姓名是："+stu2.getName()+",年龄是："+stu2.getAge());
        stu2.setAge(22);
        System.out.println("姓名是："+stu2.getName()+",年龄是："+stu2.getAge());
    }
}

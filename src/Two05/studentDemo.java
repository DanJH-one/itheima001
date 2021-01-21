package Two05;

import java.util.ArrayList;
import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        ArrayList<student> students = new ArrayList<>();
       // student student = new student();
        while (true) {
        System.out.println("=====欢迎来到学生管理系统=====");
        System.out.println("1 添加学生");
        System.out.println("2 删除学生");
        System.out.println("3 修改学生");
        System.out.println("4 查看所有学生");
        System.out.println("5 退出");
        System.out.println("请输入你的选择");
        //键盘录入
        Scanner sca = new Scanner(System.in);
        int i = sca.nextInt();
        switch (i) {
            case 1:
                tinjiaFF(students);
                break;
            case 2:
                shangchuFF(students);
                break;
            case 3:
                xiugaiFF(students);
                break;
            case 4:
                chakanFF(students);
                break;
            case 5:
                System.out.println("谢谢使用");
                System.exit(0);
                //break;
        }
    }
    }

    //添加学生方法
    public static void tinjiaFF(ArrayList<student> arr){

        String xh;
        while (true){
            System.out.println("请添加学生学号");
            Scanner scanner1 = new Scanner(System.in);
             xh = scanner1.nextLine();

            boolean uid = isUid(arr, xh);
            if (uid){
                System.out.println("学号已经存在,请重新输入");
            }else {
                break;
            }

        }

        System.out.println("请添加学生姓名");
        Scanner scanner = new Scanner(System.in);
        String xm = scanner.nextLine();


        System.out.println("请添加学生年龄");
        Scanner scanner2 = new Scanner(System.in);
        String nl = scanner2.nextLine();

        System.out.println("请添加学生居住地");
        Scanner scanner3 = new Scanner(System.in);
        String dz = scanner3.nextLine();

        //给学生对象赋值
        student student = new student();
        student.setXm(xm);
        student.setXh(xh) ;
        student.setNl(nl);
        student.setDz(dz);
        arr.add(student);
        System.out.println("添加成功");
    }

    //查看学生方法
    public static void chakanFF(ArrayList<student> ar){
        //如何还没有录入学生提示先录入学生信息再查看
       if (ar.size()==0){
           System.out.println("还没有学生信息请录入后再查看");
           return;
       }
        //有信息就直接遍历显示学生信息
           System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
           for (int i = 0; i < ar.size(); i++) {
               student student = ar.get(i);
               System.out.println(student.getXh()+"\t"+student.getXm()+"\t"+student.getNl()+"岁\t"+student.getDz());
           }
    }

    //删除学生方法
    public static void shangchuFF(ArrayList<student> arr){
        System.out.println("请输入要删除的学号");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
       //删除之前先判断有没有改学号
        int a=-1;
        for (int i = 0; i < arr.size(); i++) {
            student student = arr.get(i);
            if (student.getXh().equals(s)){
                a = i;
                break;
            }
        }

        if (a==-1) {
            System.out.println("该信息不存在请重新输入");
        }else {
            arr.remove(a);
            System.out.println("删除成功");
        }
    }

    //修改学生信息方法
    public static void xiugaiFF(ArrayList<student> arr){
        student student = new student();
        System.out.println("请输入要修改学生的学号");
        Scanner sca = new Scanner(System.in);
        String s = sca.nextLine();
        //判断学号是否存在的方法
        boolean uid = isUid(arr, s);
        if (uid){
            System.out.println("请输入新的学号");
            String xh = sca.nextLine();
            System.out.println("请输入新的姓名");
            String xm = sca.nextLine();
            System.out.println("请输入新的年龄");
            String nl = sca.nextLine();
            System.out.println("请输入新的居住地");
            String dz = sca.nextLine();

            student.setXh(xh);
            student.setXm(xm);
            student.setNl(nl);
            student.setDz(dz);

            for (int i = 0; i < arr.size(); i++) {
                student student1 = arr.get(i);
                String xh1 = student1.getXh();
                if (xh1.equals(s)){
                    arr.set(i,student);
                    break;
                }
            }
            System.out.println("修改成功");
        }else {
            System.out.println("学号不存在请重新输入");
        }

    }

    //键盘录入方法
    public static String ff(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

    //判断学号是否存在的方法
    public static boolean isUid(ArrayList<student> arr,String uid){
        boolean b = false;

        for (int i = 0; i < arr.size(); i++) {
            student student = arr.get(i);
            if (student.getXh().equals(uid)){
                b = true;
                break;
            }
        }
        return b;
    }
}

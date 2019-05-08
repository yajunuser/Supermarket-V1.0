package com.javasoso.supermarket;

import java.util.ArrayList;
import java.util.Scanner;

public class PeopleInformation {
    static Member a = new Member(1900, "08/05", 2000);
    static Member b = new Member(1711, "07/13", 4000);
    static Member c = new Member(1623, "08/05", 5000);
    static Member d = new Member(1545, "08/05", 2200);
    static Member e = new Member(1464, "08/05", 1000);
    static Member f = new Member(1372, "08/05", 3000);
    static Member g = new Member(1286, "08/05", 10080);
    static ArrayList<Member> members = new ArrayList<Member>();
    static {
        members.add(a);
        members.add(b);
        members.add(c);
        members.add(d);
        members.add(e);
        members.add(f);
        members.add(g);
    }
    public static  ArrayList<Member> getMember(){
        return members;
    }
    public static void jieMian() {
        while (true) {
            System.out.println("********************************************");
            System.out.println();
            System.out.println("\t\t\t\t" + "1.显 示 所 有 客 户 信 息");
            System.out.println();
            System.out.println("\t\t\t\t" + "2.添 加 客 户 信 息");
            System.out.println();
            System.out.println("\t\t\t\t" + "3.修 改 客 户 信 息");
            System.out.println();
            System.out.println("\t\t\t\t" + "4.查 询 客 户 信 息");
            System.out.println("********************************************");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您的选择：");
            int y = sc.nextInt();
            switch (y) {
                case 1:
                    System.out.println("会员号" + "\t\t" + "生日" + "\t\t" + "积分");
                    System.out.println("---------|----------|----------");
                    for (Member m : members) {
                        System.out.println(m.getId() + "\t\t" + m.getDay() + "\t\t" + m.getJifen());
                    }

                    break;
                case 2:
                    Scanner in = new Scanner(System.in);
                    System.out.println("输入您要添加的用户id");
                    int id = in.nextInt();
                    Scanner ni = new Scanner(System.in);
                    System.out.println("用户生日格式：月/日");
                    String day = ni.nextLine();
                    Scanner nn = new Scanner(System.in);
                    System.out.println("初始的积分(赠送)");
                    int jifen = nn.nextInt();
                    members.add(new Member(id, day, jifen));
                    System.out.println("添加成功");
                    break;
                case 3:


                    Scanner ii = new Scanner(System.in);
                    System.out.println("输入你要修改的id：");
                    int idd = ii.nextInt();
                    for (int x = 0; x < members.size(); x++) {
                        if (members.get(x).getId() == idd) {
                            System.out.println("会员号" + "\t\t" + "生日" + "\t\t" + "积分");
                            System.out.println("---------|----------|----------");
                            System.out.println(members.get(x).getId()+"\t\t"+ members.get(x).getDay()+"\t\t"+ members.get(x).getJifen());
                            Scanner mm = new Scanner(System.in);
                            System.out.println("*****************************************");
                            System.out.println("\t\t\t"+"1.修 改 生 日");
                            System.out.println();
                            System.out.println("\t\t\t"+"2.修 改 积 分");
                            System.out.println("*****************************************");
                            System.out.println("请输入：");
                            int mmm = mm.nextInt();
                            switch (mmm) {
                                case 1:
                                    Scanner dd = new Scanner(System.in);
                                    System.out.println("输入生日格式：月/日");
                                    String ddd = dd.nextLine();
                                    members.get(x).setDay(ddd);
                                    break;
                                case 2:
                                    Scanner jj = new Scanner(System.in);
                                    System.out.println("输入修改后的积分");
                                    int jjj = jj.nextInt();
                                    members.get(x).setJifen(jjj);
                            }
                        }
                    }
                    break;
                case 4:
                    Scanner cx = new Scanner(System.in);
                    System.out.println("请输入您要查询的id：");
                    int cxx = cx.nextInt();
                    for (int x = 0; x < members.size(); x++) {
                        if (members.get(x).getId() == cxx) {
                            Member me = members.get(x);
                            System.out.println("会员号" + "\t\t" + "生日" + "\t\t" + "积分");
                            System.out.println("---------|----------|----------");
                            System.out.println(me.getId() + "\t\t" + me.getDay() + "\t\t" + me.getJifen());
                        }
                    }
                    break;

                default:
                    System.out.println("请输入正确的数值");

            }
            System.out.println("返回上一层输入‘n’返回上层菜单任意输入即可");
            Scanner fanhui = new Scanner(System.in);
            String fh = fanhui.nextLine();
            if (!fh.equalsIgnoreCase("n")) break;
        }
    }

    public void bianli(Member a) {
        System.out.println(a.getId() + "\t" + a.getDay() + "\t" + a.getJifen());
    }

}

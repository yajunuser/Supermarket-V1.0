package com.javasoso.supermarket;

import java.util.Scanner;

/**
 * TODO 加注释 命名不能有保留字
 */
public class GoTo {
    static String name = "admin";
    static String userkey = "admin";

    /**
     * TODO 加注释 参数命名要意义
     * @param a
     * @param b
     */
    public static boolean dengLu(String a, String b) {
        // FIXME 所有的未知输入使用前需要判空
        //判断 登录的账号密码是不是一样
        if (!name.equals(a) || !userkey.equals(b)) {
            System.out.println("你输入的管理账号密码不正确");
            return true;
        }
        while(true) {

                System.out.println("\t\t\t\t" + "欢迎使用购物管理系统");
                System.out.println();
                System.out.println("********************************************");
                System.out.println();
                System.out.println("\t\t\t\t" + "1.客 户 信 息 管 理");
                System.out.println();
                System.out.println("\t\t\t\t" + "2.购 物 结 算");
                System.out.println();
                System.out.println("\t\t\t\t" + "3.真 情 回 馈");
                System.out.println();
                System.out.println("\t\t\t\t" + "4.注 销");
                System.out.println();
                System.out.println("\t\t\t\t" + "0.返 回");
                System.out.println();
                System.out.println("********************************************");
                Scanner in = new Scanner(System.in);
                System.out.println("请输入您的选择：");
                int x = in.nextInt();
                switch (x) {
                    case 0:
                        return true;
                    case 1:
                        //在这创建一个PeopleInformation类的对象，
                        PeopleInformation.jieMian();
                        break;
                    case 2:
                        Goodsxlm.shopping();
                        break;
                    case 3:
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                }


            System.out.println("返回上一层输入‘n’返回上层菜单任意输入即可");
            Scanner fanhui = new Scanner(System.in);
            String fh = fanhui.nextLine();
            if (fh.equalsIgnoreCase("n")) {
                return true;
            }
        }
    }


}

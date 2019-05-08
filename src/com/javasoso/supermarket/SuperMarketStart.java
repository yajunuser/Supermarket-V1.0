package com.javasoso.supermarket;

import java.util.Scanner;

public class SuperMarketStart {
    public static void main(String[] args) {
        //欢迎界面
        while (true) {
            System.out.println("----------------欢迎使用亚军超市购物系统 V1.0----------------");
            System.out.println();
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("\t\t\t\t" + "1.登 录 系 统");
            System.out.println();
            System.out.println("\t\t\t\t" + "2.更 改 管 理 员 密 码");
            System.out.println();
            System.out.println("\t\t\t\t" + "3.退 出");
            System.out.println();
            System.out.println("*********************************************************");
            Scanner in = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            // FIXME 对未知的输入做判断，防止异常
//            String key = in.nextInt();
            Integer key = 0;
            try {
                key = Integer.valueOf(in.nextLine());
            }catch (Exception e){
                System.out.println("输入有误 请输入数字");
                continue;
            }

            //根据输入 做相应的动作
            switch (key) {
                case 1:

//                    Scanner ss = new Scanner(System.in);
                    System.out.println("请输入您的管理账号：");
                    String name = in.nextLine();
//                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入您的管理密码：");
                    String possword = in.nextLine();
                    //调用登录功能 判断账号密码是否一致 并实现登录后的界面
                    boolean c = GoTo.dengLu(name, possword);
                    if (c){
                        continue;
                    }else {
                        return;
                    }

                case 2:
                    System.out.println("暂时不支持此功能");
                    break;
                case 3:
                    System.out.println("谢谢惠顾！下次再见");
                    System.exit(0);
                    break;
                default:
                    System.out.println("请按照菜单项输入");
                    continue;
            }
            System.out.println("返回上菜单输入‘n’退出按任意键");
//            Scanner fanhui = new Scanner(System.in);
            String fh = in.nextLine();
            if (!fh.equalsIgnoreCase("n")) {
                System.out.println("--");
                break;
            }else {
                System.out.println("==");
            }
        }
    }
}
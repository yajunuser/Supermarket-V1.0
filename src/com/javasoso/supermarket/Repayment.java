package com.javasoso.supermarket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Repayment {
    private static ArrayList<Member> members = PeopleInformation.getMember();

    public static void giveGood() {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("***************************************");
            System.out.println();
            System.out.println("\t\t\t\t" + "1.幸 运 大 放 送");
            System.out.println();
            System.out.println("\t\t\t\t" + "2.幸 运 抽 奖");
            System.out.println();
            System.out.println("\t\t\t\t" + "3.生 日 问 候");
            System.out.println();
            System.out.println("***************************************");
            System.out.println("请选择，输入数字或按“n”返回上一级菜单：");
            Integer key = 0;
            try {
                key = Integer.valueOf(in.nextLine());
            } catch (Exception e) {
                System.out.println("请输入对应的内容");
            }

            switch (key) {
                case 1:
//                    for (int x = 0; x < members.size() - 1; x++) {
//                        for (int y = (x + 1); y < members.size(); y++) {
//                            Member a = members.get(x).getJifen() > members.get(y).getJifen() ?
//                                    members.get(x) : members.get(y);
//                        }
//                    }
                    int max = members.get(0).getJifen();
                    for (int x = 0; x < members.size(); x++) {
                        int temp = members.get(x).getJifen();
                        if(temp>max){
                            max =temp;
                        }
                    }
                    for (int x = 0; x < members.size(); x++) {
                        if(members.get(x).getJifen()==max){
                            System.out.print("具有最高积分的会员是");
                            System.out.println(members.get(x).getId() + "\t\t" + members.get(x).getDay() + "\t\t" + members.get(x).getJifen());
                            System.out.println("恭喜！获赠礼品：一袋价值12元的洗衣粉一袋");
                        }
                    }

                    break;
                case 2:
                    System.out.println("是否开始抽奖Y/N");
                    String f = in.nextLine();
                    if ("Y".equalsIgnoreCase(f)) {
                        Collections.shuffle(members);
                        System.out.println("幸运用户获赠MP3：" + members.get(1).getId());
                        break;
                    } else {
                        break;
                    }

                case 3:
                    System.out.println("请输入今天的日期（月/日<用两位数表示>）");
                    String date = in.nextLine();
                    for (Member m : members) {
                        if (m.getDay().equals(date)) {
                            System.out.println("过生日的会员是：" + m.getId());
                            System.out.println("恭喜！获得MP3一个！");
                        } else {
                            System.out.println("没有会员过生日！");
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("你的输入有错误");
            }
            System.out.println("返回上一级选n：");
            String n = in.nextLine();
            if ("n".equalsIgnoreCase(n)) {
                continue;
            } else {
                break;
            }
        }
    }
}

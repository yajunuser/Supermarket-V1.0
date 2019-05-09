package com.javasoso.supermarket;


import java.util.ArrayList;
import java.util.Scanner;

public class Square {
//   private static ArrayList<Member> members = PeopleInformation.getMember();
//   private static  HashMap<Integer,Goods> map = Goodsxlm.getGods();
   private static ArrayList<ShopListing> shop = Goodsxlm.getShops();
    public static void oddChange() {
        Scanner in = new Scanner(System.in);
        System.out.println("*******************消费清单******************");
        System.out.println("物品"+"\t\t"+"单价"+"\t"+"个数"+"\t\t"+"金额");
        double sum =0;
        for (ShopListing s : shop) {
            System.out.println(s.getGoodsname()+"\t"+s.getPrice()+"\t\t"+s.getNnubmer()+"\t\t"+s.getSum()+"￥");
            sum = sum + s.getSum();
        }
        System.out.println("----------------------------------------------");
        System.out.print("折扣");
        double zhekou = in.nextDouble();
        System.out.printf("金额总计%.2f￥:",sum*zhekou);
        System.out.println();
        System.out.print("实际交费:");
        double givemoney =in.nextDouble();
        System.out.println();
        System.out.printf("找钱%.2f:",(givemoney-sum*zhekou));
        System.out.println();
        System.out.printf("本次购物所获积分是%.0f:",integral(sum));
        System.out.println("谢谢光临");
        System.exit(0);
    }

    public static double integral(double sum) {
        return sum*0.03;
    }
}

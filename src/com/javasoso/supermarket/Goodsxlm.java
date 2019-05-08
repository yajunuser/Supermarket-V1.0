package com.javasoso.supermarket;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Goodsxlm {
    static HashMap<Integer, Goods> map = new HashMap<Integer, Goods>();
    static Goods a = new Goods("addidas运动鞋", 499);
    static Goods b = new Goods("Kappa网球拍", 448);
    static Goods c = new Goods("网球拍", 219);
    static Goods e = new Goods("addidasT恤", 149);
    static Goods f = new Goods("Nike运动鞋", 399);
    static Goods g = new Goods("Kappa网球", 59);
    static Goods h = new Goods("KappaT恤", 99);

    public static void shopping() {


        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        map.put(4, e);
        map.put(5, f);
        map.put(6, g);
        map.put(7, h);
        System.out.println("***************************************");
        System.out.println("请选择购买的商品编号：");
        Set<Integer> it = map.keySet();
        for (Integer key : it) {
            Goods values = map.get(key);
            System.out.println(key + ":" + values.getGoodsname());
        }
        System.out.println("***************************************");
            Scanner in = new Scanner(System.in);
            System.out.println("请输入会员号：");
            int number = in.nextInt();

        while (true) {

            System.out.println("请输入商品编号：");
            System.out.println("请输入数目：");
        }
    }
}
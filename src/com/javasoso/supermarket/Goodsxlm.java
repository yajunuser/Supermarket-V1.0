package com.javasoso.supermarket;

import java.util.*;

public class Goodsxlm {
    private static HashMap<Integer, Goods> map = new HashMap<Integer, Goods>();
    private static Goods a = new Goods("addidas运动鞋", 499);
    private static Goods b = new Goods("Kappa网球拍", 448);
    private static Goods c = new Goods("网球拍", 219);
    private static Goods e = new Goods("addidasT恤", 149);
    private static Goods f = new Goods("Nike运动鞋", 399);
    private static Goods g = new Goods("Kappa网球", 59);
    private static Goods h = new Goods("KappaT恤", 99);

    static {
        map.put(1, a);
        map.put(2, b);
        map.put(3, c);
        map.put(4, e);
        map.put(5, f);
        map.put(6, g);
        map.put(7, h);
//        PeopleInformation.getMember(); PeopleInformation.getMemberId();
    }

    //创建一个集合存储会员买的 商品 单价 个数 金额
    private static ArrayList<ShopListing> shop = new ArrayList<ShopListing>();

    public static ArrayList<ShopListing> getShops() {
        return shop;
    }

    public static HashMap<Integer, Goods> getGods() {
        return map;
    }

    private static HashSet<Integer> memberid = PeopleInformation.getMemberId();
    private static ArrayList<Member> member = PeopleInformation.getMember();

    private static String goodsname;
    private static double price;
    private static double numbers;
    private static double sum;

    public static void shopping() {
        Scanner in = new Scanner(System.in);
        Set<Integer> it = map.keySet();

        System.out.println("***************************************");
        System.out.println("请选择购买的商品编号：");

        for (Integer key : it) {
            Goods values = map.get(key);
            System.out.println(key + ":" + values.getGoodsname() + "\t\t\t" + values.getPrice() + "￥");
        }
        System.out.println("***************************************");

        while (true) {
            System.out.println("请输入会员号：");
            Integer number = 0;
            //FIXME 判断！！！是不是正确的输入
            try {
                number = Integer.valueOf(in.nextLine());
            } catch (Exception e) {

            }

            if (!memberid.contains(number)) {
                System.out.println("您输入的会员不存在！");
                continue;
            }


            while (true) {
                Scanner nnn = new Scanner(System.in);
                System.out.println("请输入商品编号：");
                Integer sp = 0;
                try {
                    sp = Integer.valueOf(nnn.nextLine());
                } catch (Exception e) {
                    System.out.println("请输入正确的数字");
                    continue;
                }
                if (!it.contains(sp)) {
                    System.out.println("商品不存在");
                    continue;
                }
                // -----------
                Scanner uu = new Scanner(System.in);
                System.out.println("请输入数目：");
                Integer ss = 0;
                try {
                    ss = Integer.valueOf(uu.nextLine());
                } catch (Exception e) {
                    System.out.println("请输入一个正确的整数");
                    continue;
                }
                numbers = ss;
//                if (in.hasNextInt()) {
//                    ss = in.nextInt();
//                    numbers = ss;
//                } else {
//                    System.out.println("请输入一个整数");
//                    continue;
//                }
                // -----------


//                for (Integer good : it) {
//                    if (sp == good) {
//                        Scanner uu = new Scanner(System.in);
//                        System.out.println("请输入数目：");
//                        Integer ss = 0;
//                        try {
//                            ss = Integer.valueOf(uu.nextLine());
//                        } catch (Exception e) {
//                            System.out.println("请输入一个正确的整数");
//                            continue;
//                        }
//                        if (in.hasNextInt()) {
//                            ss = in.nextInt();
//                            numbers = ss;
//                            break;
//                        } else {
//                            System.out.println("请输入一个整数");
//                            continue;
//                        }
//
//                    }
//                }
                goodsname = map.get(sp).getGoodsname();
                price = map.get(sp).getPrice();

                sum = numbers * price;
                shop.add(new ShopListing(goodsname, price, numbers, sum));

                Scanner nn = new Scanner(System.in);
                System.out.println("是否继续购买Y/结算N：");

                String f = nn.nextLine();
                if ("Y".equalsIgnoreCase(f)) continue;
                else if ("N".equalsIgnoreCase(f)) {
                    Square.oddChange();
                } else {
                    System.out.println("请输入对应的选项");
                }





            }

        }
    }
}

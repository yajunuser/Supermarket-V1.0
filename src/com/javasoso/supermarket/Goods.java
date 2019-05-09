package com.javasoso.supermarket;

public class Goods {
    private String goodsname;
    private int price;


    public Goods() {
    }

    public Goods(String goodsname, int price) {
        this.goodsname = goodsname;
        this.price = price;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

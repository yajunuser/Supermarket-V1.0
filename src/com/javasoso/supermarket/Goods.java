package com.javasoso.supermarket;

import java.util.ArrayList;

public class Goods {
    private String Goodsname;
    private int price;

    public Goods() {
    }

    public Goods(String goodsname, int price) {
        Goodsname = goodsname;
        this.price = price;
    }

    public String getGoodsname() {
        return Goodsname;
    }

    public void setGoodsname(String goodsname) {
        Goodsname = goodsname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

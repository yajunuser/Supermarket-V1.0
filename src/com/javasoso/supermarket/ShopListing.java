package com.javasoso.supermarket;

public class ShopListing{
    private String goodsname;
    private double  price;
    private double number;
    private double  sum;

    public ShopListing() {

    }

    public ShopListing(String goodsname, double price, double nnubmer, double sum) {
        this.goodsname = goodsname;
        this.price = price;
        this.number = nnubmer;
        this.sum = sum;

    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getNnubmer() {
        return number;
    }

    public void setNnubmer(int nnubmer) {
        this.number = nnubmer;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}

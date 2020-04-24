package com.webcontrol.entities;

public class GoodsInfoEntity {
    private int goodsId;
    private String name;
    private String image;
    private double mallPrice;
    private double price;

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getMallPrice() {
        return mallPrice;
    }

    public void setMallPrice(double mallPrice) {
        this.mallPrice = mallPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsInfoEntity{" +
                "goodsId=" + goodsId +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", mallPrice=" + mallPrice +
                ", price=" + price +
                '}';
    }
}

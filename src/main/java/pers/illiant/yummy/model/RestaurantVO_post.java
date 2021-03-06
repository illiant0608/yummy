package pers.illiant.yummy.model;

import pers.illiant.yummy.entity.Restaurant;

public class RestaurantVO_post {
    private String restaurantId;
    private String shopName;
    private int rate = 4;
    private double deliveryCost = 3;
    private String imgUrl;

    //todo 需要加入rate字段，根据用户地址和店铺地址之间的距离计算配送费用

    public RestaurantVO_post() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public RestaurantVO_post(String shopName, int rate, double deliveryCost, String imgUrl, String restaurantId) {
        this.shopName = shopName;
        this.rate = rate;
        this.deliveryCost = deliveryCost;
        this.imgUrl = imgUrl;
        this.restaurantId = restaurantId;
    }

    public RestaurantVO_post(Restaurant restaurant) {
        this.shopName = restaurant.getShopName();
        this.imgUrl = restaurant.getImgurl();
        this.restaurantId = restaurant.getRestaurantId();
        //todo 要计算出rate和配送费用，现在先用一个虚拟值
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getDeliveryCost() {
        return deliveryCost;
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }
}

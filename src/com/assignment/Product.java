package com.assignment;

public class Product {
    private String productName;
    private int buyPrice;
    private int sellPrice;
    private int availableNumber;
    private int profit;
    public Product(){
    }
    public Product(String productName, int buyPrice, int sellPrice, int availableNumber,int profit){
        this.productName = productName;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.availableNumber = availableNumber;
        this.profit = profit;
    }
    public void setProductName(String productName){
        this.productName= productName;
    }
    public String getProductName(){
        return productName;
    }
    public void setBuyPrice(int buyPrice){
        this.buyPrice = buyPrice;
    }
    public int getBuyPrice(){
        return  buyPrice;
    }
    public void setSellPrice(int sellPrice){
        this.sellPrice = sellPrice;
    }
    public int getSellPrice(){
        return sellPrice;
    }
    public void setAvailableNumber(int availableNumber){
        this.availableNumber = availableNumber;
    }
    public int getAvailableNumber(){
        return availableNumber;
    }
    public void setProfit(int p){
        profit = p;
    }
    public int getProfit(){
        return profit;
    }
    public void showProduct(){

        System.out.print(" name : "+productName);
        System.out.print(" buying price : "+buyPrice);
        System.out.print(" selling price : "+sellPrice);
        System.out.print(" available : "+availableNumber);
        System.out.print(" profit : "+profit);
    }
}

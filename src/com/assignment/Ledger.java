package com.assignment;
import java.util.LinkedList;

public class Ledger {
    private final LinkedList<Product> products;
    private int availableBalance;

    Ledger(){
        products = new LinkedList<Product>();
        availableBalance=0;
    }

    public void addProduct(String productName, int buyPrice, int sellPrice, int availableNumber, int profit) {
        if(!productName.equals("") && buyPrice >= 0 && sellPrice >= 0 && availableNumber >= 0 && profit >= 0 ){
            Product p = new Product(productName,buyPrice,sellPrice,availableNumber,profit);
            products.add(p);
        }
        else{
            System.out.println("Enter Valid product description");
        }
    }

    public void deleteProduct(String productName) {
        int index = isAvailable(productName);
        if(index >= 0){
            products.remove(index);
        }
        else{
            System.out.println("Product name does not matched");
        }
    }

    public void buyProduct(String productName, int buyingNumber) {
        int index = isAvailable(productName);
        if(index >= 0){
            products.get(index).setAvailableNumber(buyingNumber +  products.get(index).getAvailableNumber());
            availableBalance -= products.get(index).getBuyPrice() * buyingNumber;
        }
        else{
            System.out.println("Product name does not matched");
        }
    }

    public void sellProduct(String productName, int sellingNumber) {
        int index = isAvailable(productName);
        if(index >= 0 && products.get(index).getAvailableNumber() >= sellingNumber){
            availableBalance += products.get(index).getSellPrice() * sellingNumber;
            products.get(index).setProfit(products.get(index).getProfit() + ( products.get(index).getSellPrice() * sellingNumber - products.get(index).getBuyPrice()*sellingNumber));
            products.get(index).setAvailableNumber(products.get(index).getAvailableNumber() - sellingNumber);
        }
        else{
            System.out.println("Product name does not matched or the Amount is not available");
        }
    }

    public int isAvailable(String productName){
        int productSize = products.size();
        for(int i=0;i<productSize;i++){
            if(products.get(i).getProductName().equals(productName)){
                return i;
            }
        }
        return -1;
    }

    public void showProducts(){
        System.out.printf("%33s %33s %33s%n", "Name", "Available number", "profit");
        System.out.printf("%33s %33s %33s%n", "-", "-", "-");
        for (Product product : products) {
            System.out.printf("%33s %33s %33s%n",  product.getProductName() , product.getAvailableNumber(), product.getProfit());
        }
        System.out.println("");
    }
    public void showBalance(){
        System.out.println("Available Balance is " + availableBalance);
    }
}


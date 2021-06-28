package com.assignment;

public class Main {
    public static void main(String[] args) {
        Ledger ledger =new Ledger();

        ledger.showProducts();

        ledger.addProduct("Laptop", 20000, 25000, 10, 0);
        ledger.addProduct("computer", 15000, 20000, 5, 0);
        ledger.addProduct("mobile", 5000, 8000, 5, 0);
        ledger.addProduct("TV", 15000, 18000, 5, 0);
        ledger.addProduct("AC", 15000, 17000, 3, 0);
        ledger.showProducts();

        ledger.sellProduct("Laptop", 5);
        ledger.sellProduct("computer", 5);
        ledger.sellProduct("Laptop", 2);
        ledger.showProducts();

        ledger.showBalance();
    }
}

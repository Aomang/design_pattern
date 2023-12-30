package Startegy;

public class Main {
    public static void main(String[] args) {
        Total pay = new Total(); 
        pay.setPaytime(new ChristmasDiscounter()); 
        System.out.println("pay at Xmas time " + pay.applyDiscount()); 
         
        pay.setPaytime(new EasterDiscounter()); 
        System.out.println("pay at Easter time " + pay.applyDiscount()); 
        
        
    }
}

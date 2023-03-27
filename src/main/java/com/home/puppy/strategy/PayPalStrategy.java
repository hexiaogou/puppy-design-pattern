package com.home.puppy.strategy;

/**
 * PayPalStrategy
 *
 * @author hexiaogou
 * @desc paypal strategy
 * @date 2023-03-27 20:44
 */
public class PayPalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;

    public PayPalStrategy(String emailId, String password){
        this.emailId=emailId;
        this.password=password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal");
    }
}

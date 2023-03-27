package com.home.puppy.strategy;

/**
 * CreditCardStrategy
 *
 * @author hexiaogou
 * @desc credit card strategy
 * @date 2023-03-27 20:43
 */
public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

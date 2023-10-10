package org.example.week3;

public class Amazon extends CanaraBank {


    @Override
    public void cashOnDelivery() {
        System.out.println(" CashOnDelivery Payment Mode");

    }

    @Override
    public void upiPayments() {
        System.out.println("UPI Payment Mode");

    }

    @Override
    public void cardPayments() {
        System.out.println("Card Payments Mode");

    }

    @Override
    public void internetBanking() {
        System.out.println("Internet Banking");

    }

    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.upiPayments();
        amazon.cardPayments();
        amazon.internetBanking();
        amazon.cashOnDelivery();
        amazon.recordPaymentDetails();
    }
}

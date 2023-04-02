package org.seleniumprograms;

public class TestScenarioForCreditCard {

	public static void main(String[] args) {
		
		System.out.println("The Test Scenario  For CreditCards Are Listed below");
		
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		System.out.println("Activation Of Card: Verify that a credit card can be activated successfully after it is issued to a customer" 
				+"				Test the activation process through various channels, "
				+"				such as phone, online, or mobile app, and ensure that the card is activated as expected ");
		System.out.println("----------------------------------------------------------------------------------------");
		
		System.out.println("Transaction authorization: Test the transaction authorization process of a credit card by attempting to make a purchase that exceeds the card's available credit limit."
				+ " Verify that the transaction is declinedand the cardholder receives a notification explaining why the transaction was denied.");
				
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("Limit of Card: Test the credit limit feature of a credit card by verifying that a user can't exceed the credit limit assigned to the card."
				+ " Also verify that the cardholder can request a credit limit increase and the new limit is set correctly.");
		System.out.println("----------------------------------------------------------------------------------------");
	
	    System.out.println("Payment processing: Test the payment processing feature of a credit card by making a payment to the card balance through various channels, such as online, phone, or mobile app. "
	    		+ "Verify that the payment is processed correctly and reflects accurately on the user's account balance.");
	    System.out.println("----------------------------------------------------------------------------------------");
	    System.out.println("Benefits and rewards: Test the reward points and benefits feature of a credit card by making eligible transactions and redeeming the reward points for cashback, travel, or merchandise."
	    		+ " Verify that the reward points are accrued correctly, and the redemption process is smooth and error-free.");
	    System.out.println("----------------------------------------------------------------------------------------");
	
	    System.out.println("International usage: Test the international usage feature of a credit card by attempting to make purchases in different currencies and countries. "
	    		+ "Verify that the card works seamlessly, and the exchange rates and fees are displayed correctly on the user's account.");
	    System.out.println("----------------------------------------------------------------------------------------");
	    System.out.println("Renewal Of Card: Test the card renewal feature of a credit card by verifying that the user receives a new card before the expiration date, and the new card works seamlessly without any issues.");
	
	}
}

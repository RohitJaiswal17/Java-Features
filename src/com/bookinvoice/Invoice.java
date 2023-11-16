package com.bookinvoice;

public class Invoice {
	Book book;
	int quantity;
	double discountRate;
	double taxRate;

	public Invoice(Book book, int quantity, double discountRate, double taxRate) {
		this.book = book;
		this.quantity = quantity;
		this.discountRate = discountRate;
		this.taxRate = taxRate;
	}

	// Method for calculation
	public double calculateTotal() {
		double price = (book.price - book.price * discountRate) * quantity;
		double priceWithTaxes = price * (1 + taxRate);
		return priceWithTaxes;
	}

	// Method for displaying output
	public void printInvoice() {
		double total = calculateTotal();
		System.out.println(quantity + "x " + book.name + " " + book.price + "$");
		System.out.println("Discount Rate: " + discountRate);
		System.out.println("Tax Rate: " + taxRate);
		System.out.println("Total: " + total); // System.out.println("Total: " + calculateTotal()); // Directly call
												// calculateTotal()
	}

}

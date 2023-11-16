package com.bookinvoice;

import java.util.Scanner;

public class InvoiceApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get book details from the user
        System.out.print("Enter book name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter author name: ");
        String authorName = scanner.nextLine();

        System.out.print("Enter book price: ");
        double bookPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline left in the buffer

        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left in the buffer

        System.out.print("Enter ISBN: ");
        String isbn = scanner.nextLine();

        // Create a book instance
        Book book = new Book(bookName, authorName, bookPrice, publicationYear, isbn);

        // Get invoice details from the user
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter discount rate: ");
        double discountRate = scanner.nextDouble();

        System.out.print("Enter tax rate: ");
        double taxRate = scanner.nextDouble();

        // Create an invoice instance
        Invoice invoice = new Invoice(book, quantity, discountRate, taxRate);

        // Close the scanner
        scanner.close();

        // Print the invoice details
        invoice.printInvoice();
    }
}

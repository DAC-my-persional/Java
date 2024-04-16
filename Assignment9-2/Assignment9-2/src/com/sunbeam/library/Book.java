package com.sunbeam.library;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Book implements Comparator<Book> {

	String isbn;
	double price;
	Category c;
	String AuthorName;
	int quantity;

	enum Category {
		scifi, horror, fictional, documentary;
	}

	Book() {

	}

	public String getIsbn() {
		return isbn;
	}

	public double getPrice() {
		return price;
	}

	public Category getC() {
		return c;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setC(Category c) {
		this.c = c;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Book(String isbn, String authorName, double price, int quantity) {
		this.isbn = isbn;
		this.price = price;
		// this.c = c;
		AuthorName = authorName;
		this.quantity = quantity;
	}

	public void accept() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter ISBN: ");
		this.isbn = scanner.nextLine();

		System.out.print("Enter author name: ");
		this.AuthorName = scanner.nextLine();

		System.out.print("Enter price: ");
		this.price = scanner.nextDouble();

		System.out.print("Enter quantity: ");
		this.quantity = scanner.nextInt();

		// Assuming the category is selected from a list of options
		System.out.println("Select a category:");
		for (Category category : Category.values()) {
			System.out.println(category);
		}
		String categoryInput = scanner.next();
		this.c = Category.valueOf(categoryInput);

	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", Category=" + c + ", AuthorName=" + AuthorName
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(AuthorName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(isbn, other.isbn);
	}

	@Override
	public int compare(Book o1, Book o2) {
		return o1.AuthorName.compareTo(o2.AuthorName);
	}

}

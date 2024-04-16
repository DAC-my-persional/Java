package com.sunbeam.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {

		Set<Book> bookList = new HashSet<>();
		Book b;

		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Accept book details and add in collection");
			System.out.println("2. Display all books from collection");
			System.out.println("3. Sort the book details as per category and display it.");
			System.out.println("4. Sort the book details as per author and display it.");
			System.out.println("5. Find Book by id.");
			System.out.print("Enter a choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				b = new Book();
				b.accept();
				bookList.add(b);

				break;
			case 2:

				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:

				List<Book> bl = new ArrayList<>(bookList);
				class sortCategory implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {

						return o1.c.compareTo(o2.c);
					}

				}
				Comparator<Book> bk = new sortCategory();
				Collections.sort(bl, bk);

				for (Book book : bl) {
					System.out.println(book);
				}

				break;
			case 4:
				List<Book> bl1 = new ArrayList<>(bookList);
				class sortAuthorName implements Comparator<Book> {

					@Override
					public int compare(Book o1, Book o2) {

						return o1.AuthorName.compareTo(o2.AuthorName);
					}

				}
				Comparator<Book> bk1 = new sortAuthorName();
				Collections.sort(bl1, bk1);

				for (Book book : bl1) {
					System.out.println(book);
				}

				break;
			case 5:
				
					Book b1 = new Book();
					System.out.print("Enter the Book ISBN Number: ");
					String isbn1;
					isbn1 = sc.next();
					boolean found = false;
					for (Book book1 : bookList) {
						if (book1.getIsbn().equals(isbn1)) {
							System.out.println("Book Found");
							System.out.println(book1);
							found = true;
							break;
						}

					}
					if (!found) {
						System.out.println("Book not found!");
					}

				
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (choice != 0);

	}

}

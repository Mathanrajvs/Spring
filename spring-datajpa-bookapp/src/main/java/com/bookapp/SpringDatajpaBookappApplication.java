package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;

@SpringBootApplication
public class SpringDatajpaBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaBookappApplication.class, args);
	}

	private IBookService bookService;
	@Autowired
	public void setBookService(IBookService bookService) {
		this.bookService = bookService;
	}

	@Override
	public void run(String... args) throws Exception {
		Book book=new Book(4,"Spring","Love","Raya",100);
		bookService.addBook(book);
		System.out.println("Get By Author...");
		bookService.getByAuthor("Ram").forEach(System.out::println);
		System.out.println("Get By Category...");
		bookService.getByCategory("Love").forEach(System.out::println);
		System.out.println("Get by Price....");
		bookService.getByPrice(250).forEach(System.out::println);
	}

}

package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
//		Book book=new Book(4,"Spring","Love","Raya",100);
//		bookService.addBook(book);
//		System.out.println("Get By Author...");
//		bookService.getByAuthor("Ram").forEach(System.out::println);
//		System.out.println("Get By Category...");
//		bookService.getByCategory("Love").forEach(System.out::println);
//		System.out.println("Get by Price....");
//		bookService.getByPrice(250).forEach(System.out::println);
//		System.out.println("Get book By ID :");
//		Book book=bookService.getById(3);
//		System.out.println(book);
//		book.setAuthor("Rohan");
//		book.setPrice(50);
//		System.out.println(book);
		
//		Book book=new Book(22,"5amm","Action","Robin",200);
//		bookService.addBook(book);
//		System.out.println("Get By Author :");
//		bookService.getBooksByAuth("Raya").forEach(System.out::println);
//		System.out.println("Get By Category and Author :");
//		bookService.getByCatAndAuth("Action", "Raya").forEach(System.out::println);
		
//		System.out.println("Get Category and Price ");
//		bookService.getBookByCatPrice("Action", 400).forEach(System.out::println);
//		
//		int count=bookService.getTotalCount();
//		System.out.println("Total count :"+count);
//		System.out.println("Minimum Price");
//		bookService.getMinPrice().forEach(System.out::println);
		
		
		//error
		System.out.println("Get Title and Author ");
		bookService.getBooksbyTitleAuth("Spring", "Raya").forEach(System.out::println);
		
//		System.out.println("Get Author ");
//		bookService.getBooksByAuth("Ram").forEach(System.out::println);
		
		//using modify annotations
//		System.out.println("Get Update Cost Using Author ");
//		bookService.update(2,200);
	}

}

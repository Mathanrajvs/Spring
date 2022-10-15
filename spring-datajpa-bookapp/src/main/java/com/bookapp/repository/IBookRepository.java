package com.bookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookapp.model.Book;
@Repository
public interface IBookRepository extends JpaRepository<Book, Integer > {
  //derived queries
	List<Book> findByAuthor(String author);
	List<Book> readByCategory(String category);
	List<Book> getByPriceLessThanEqual(double price);
	
	
	//custom queries
	@Query("from Book b where b.author=?2 and b.price<=?1")//from Book -->Model,Instance Variables are used
	List<Book> getByPriceAuth(double cost,String author);
	@Query("from Book b where b.author=?2 and b.category=?1")
	List<Book> getByCatAndAuth(String category,String author);
	//@Query("from Book b where b.author=?1")
	
	//Named Query
	@Query(name="findByAuth")
	List<Book> findBooksByAuth(String author);
	
	
	
	//native query-pass the sql query
	@Query(value="select * from book where category=?1 and cost<=?2",nativeQuery = true)
	List<Book> findBooksByCatPrice(String Category,double price);
	@Query(value="select count(*) from book",nativeQuery = true)
	int findTotalCount();
	@Query(value="select * from book where cost=(select min(cost) from book)",nativeQuery = true)
	List<Book> findMinPrice();
	
	//Named Native Query
	@Query(name="findByTitleAuthor")
	List<Book> findBooksbyTitleAuthor(String title, String author);
	
	
	@Modifying
	@Query(value="update Book set cost=?2 where book_id=?1",nativeQuery=true)
	void updateBook(int bookId,double price);

}

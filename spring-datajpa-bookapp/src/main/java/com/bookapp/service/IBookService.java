package com.bookapp.service;

import java.util.List;

import com.bookapp.model.Book;

public interface IBookService {
void addBook(Book book);
void updateBook(Book book);
void deleteBook(int bookId);
Book getById(int bookId);
List<Book> getAll();

List<Book> getByAuthor(String author);
List<Book> getByCategory(String category);
List<Book> getByPrice(double price);
}

package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Book;

public interface BookService {
	public void saveBook(Book book);
	public Book getBook(Integer id);
	public Iterable<Book> getAllBooks();
	public void deleteBook(Integer id);
	Book editBook(Integer id, Book book);
}

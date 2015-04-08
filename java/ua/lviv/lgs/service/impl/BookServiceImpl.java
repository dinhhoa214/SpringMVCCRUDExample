package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.BookDAO;
import ua.lviv.lgs.model.Book;
import ua.lviv.lgs.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
	@Autowired
	private BookDAO dao;

	@Override
	@Transactional
	public void saveBook(Book book) {
		dao.save(book);
	}

	@Override
	public Book getBook(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Book> getAllBooks() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Book editBook(Integer id, Book book) {
		Book newBook = dao.findOne(id);
		newBook.setTitle(book.getTitle());
		newBook.setAuthor(book.getAuthor());
		return dao.save(newBook);
	}

	@Override
	@Transactional
	public void deleteBook(Integer id) {
		dao.delete(id);
	}

}

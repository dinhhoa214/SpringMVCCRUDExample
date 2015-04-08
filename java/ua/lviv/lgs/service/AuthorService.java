package ua.lviv.lgs.service;

import ua.lviv.lgs.model.Author;

public interface AuthorService {
	public void saveAuthor(Author Author);
	public Author getAuthor(Integer id);
	public Iterable<Author> getAllAuthors();
	public void deleteAuthor(Integer id);
	Author editAuthor(Integer id, Author author);
}

package ua.lviv.lgs.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.dao.AuthorDAO;
import ua.lviv.lgs.model.Author;
import ua.lviv.lgs.service.AuthorService;

@Service("authorService")
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	private AuthorDAO dao;

	@Override
	@Transactional
	public void saveAuthor(Author Author) {
		dao.save(Author);
	}

	@Override
	public Author getAuthor(Integer id) {
		return dao.findOne(id);
	}

	@Override
	public Iterable<Author> getAllAuthors() {
		return dao.findAll();
	}

	@Override
	@Transactional
	public Author editAuthor(Integer id, Author author) {
		Author newAuthor = dao.findOne(id);
		newAuthor.setAuthorName(author.getAuthorName());
		return dao.save(newAuthor);
	}

	@Override
	@Transactional
	public void deleteAuthor(Integer id) {
		dao.delete(id);
	}

}

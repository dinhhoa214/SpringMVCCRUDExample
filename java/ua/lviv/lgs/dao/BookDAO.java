package ua.lviv.lgs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.Book;

@Repository
public interface BookDAO extends
		CrudRepository<Book, Integer> {

}

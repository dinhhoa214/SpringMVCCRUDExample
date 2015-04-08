package ua.lviv.lgs.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.model.Author;
@Repository
public interface AuthorDAO extends
		CrudRepository<Author, Integer> {

}

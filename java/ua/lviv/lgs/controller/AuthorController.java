package ua.lviv.lgs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import ua.lviv.lgs.model.Author;
import ua.lviv.lgs.service.AuthorService;

@Controller
public class AuthorController {

	@Autowired
	@Qualifier("authorService")
	private AuthorService service;

	@RequestMapping(value = "/authors", method = RequestMethod.GET)
	public String listAuthors(Model model) {
		Author author = new Author();
		author.setId(100);
		model.addAttribute("author", author);
		model.addAttribute("authors",
				service.getAllAuthors());
		return "authors";
	}

	@RequestMapping(value = "/authors/add", method = RequestMethod.POST)
	public String addAuthor(
			@ModelAttribute("author") Author a) {
		service.saveAuthor(a);
		return "redirect:/authors";
	}

	@RequestMapping("/authors/remove/{id}")
	public String deleteAuthor(@PathVariable("id") int identif) {
		service.deleteAuthor(identif);
		return "redirect:/authors";
	}
}

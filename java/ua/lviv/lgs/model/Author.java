package ua.lviv.lgs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author_table")
public class Author {
	@Id
	@GeneratedValue
	@Column(name = "author_id")
	private Integer id;
	@Column(name = "author_name")
	private String authorName;

	public Author() {
	}

	public Author(String authorName) {
		super();
		this.authorName = authorName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName="
				+ authorName + "]";
	}

}

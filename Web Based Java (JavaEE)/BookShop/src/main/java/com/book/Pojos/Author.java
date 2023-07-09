package com.book.Pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Authors")
public class Author extends BaseEntity {

	@Column(name = "first_Name", length = 25)
	private String firstName;

	@Column(name = "last_Name", length = 25)
	private String lastName;

	@OneToMany(mappedBy = "assignedID", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Book> books = new ArrayList<>();

	public Author() {
		// Default constructor
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getters and Setters

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", books=" + books + "]";
	}

}

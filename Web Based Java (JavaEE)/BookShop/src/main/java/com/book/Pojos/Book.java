package com.book.Pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Books")
public class Book extends BaseEntity {

	@Column(name = "Title", length = 25)
	private String title;
	@Column(name = "Quantity")
	private int qty;
	@Column(name = "Price")
	private double price;
	@Column(name = "Publish_Date")
	private LocalDate publicationDate;
	@Column(name = "Description", length = 25)
	private String description;

	@ManyToOne
	@JoinColumn(name = "Author_Id")
	private Author assignedID;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int qty, double price, LocalDate publicationDate, String description) {
		super();
		this.title = title;
		this.qty = qty;
		this.price = price;
		this.publicationDate = publicationDate;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Author getAssignedID() {
		return assignedID;
	}

	public void setAssignedID(Author assignedID) {
		this.assignedID = assignedID;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", qty=" + qty + ", price=" + price + ", publicationDate=" + publicationDate
				+ ", description=" + description + ", assignedID=" + assignedID + "]";
	}

}

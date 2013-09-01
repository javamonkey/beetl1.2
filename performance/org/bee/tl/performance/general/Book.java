package org.bee.tl.performance.general;

import java.util.Date;

public class Book
{
	String title;
	String author;
	String publisher;
	Date publication = new Date();
	double price;
	double discount;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getPublisher()
	{
		return publisher;
	}

	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}

	public Date getPublication()
	{
		return publication;
	}

	public void setPublication(Date publication)
	{
		this.publication = publication;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getDiscount()
	{
		return discount;
	}

	public void setDiscount(double discount)
	{
		this.discount = discount;
	}

}

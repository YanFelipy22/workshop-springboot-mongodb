package com.yf.workshopmongodb.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private  String text;
	private Date date;
	private AuthorDTO author;
	
	
	
	
	public CommentDTO() {
		super();
	}

	public CommentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.setText(text);
		this.setDate(date);
		this.setAuthor(author);
	}

	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	
}

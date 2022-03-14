package com.example.myboot01.Model;

public class BoardDto {
	private String id;
	private String writer;
	private String title;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BoardDto(String id, String writer, String title) {
		super();
		this.id = id;
		this.writer = writer;
		this.title = title;
	}

	
}

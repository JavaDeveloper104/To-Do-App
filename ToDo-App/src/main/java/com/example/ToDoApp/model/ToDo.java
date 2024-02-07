package com.example.ToDoApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table (name="todo")
public class ToDo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "quantity Required ")
	private Long id;
	
	@Column
	@NotNull(message = "quantity Required ")
	private String title;
	
	@Column
	@NotNull(message = "quantity Required ")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	
	@Column
	@NotNull(message = "quantity Required ")
	private String status;
	
	public ToDo() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

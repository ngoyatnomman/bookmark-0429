package com.shy.pojo;

import org.springframework.stereotype.Component;

@Component
public class Category{
	private int id;
	private String category;

	public Category(int id, String category){
		this.id = id;
		this.category = category;
	}

	public Category(){}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getCategory(){
		return category;
	}

	public void setCategory(String category){
		this.category = category;
	}

	@Override
	public String toString(){
		return "Category{" +
			"id=" + id +
			", category='" + category + '\'' +
			'}';
	}
}
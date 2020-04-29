package com.shy.pojo;

import org.springframework.stereotype.Component;

@Component
public class Bookmark{
	private int id;
	private String name;
	private String url;
	private String icon;
	private int categoryId;

	public Bookmark(int id, String name, String url, String icon, int categoryId){
		this.id = id;
		this.name = name;
		this.url = url;
		this.icon = icon;
		this.categoryId = categoryId;
	}

	public Bookmark(){}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getUrl(){
		return url;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getIcon(){
		return icon;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public int getCategoryId(){
		return categoryId;
	}

	public void setCategoryId(int categoryId){
		this.categoryId = categoryId;
	}

	@Override
	public String toString(){
		return "Bookmark{" +
			"id=" + id +
			", name='" + name + '\'' +
			", url='" + url + '\'' +
			", icon='" + icon + '\'' +
			",categoryId=" + categoryId +
			'}';
	}
}
package com.shy.pojo;

import lombok.Data;

@Data
public class Bookmark{
	private int id;
	private String name;
	private String url;
	private String icon;
	private int categoryId;
}
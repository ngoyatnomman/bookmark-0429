package com.shy.mapper;

import com.shy.pojo.Category;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CategoryMapper{

    @Select("select * from category")
    List<Category> getAllCategories();
}
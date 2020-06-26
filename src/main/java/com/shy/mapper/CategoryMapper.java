package com.shy.mapper;

import com.shy.pojo.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryMapper{

    @Select("select * from category")
    List<Category> getAllCategories();
}
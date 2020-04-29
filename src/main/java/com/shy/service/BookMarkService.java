package com.shy.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shy.mapper.BookmarkMapper;
import com.shy.mapper.CategoryMapper;
import com.shy.pojo.Bookmark;
import com.shy.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookMarkService {
    @Autowired
    private BookmarkMapper bookmarkMapper;
    @Autowired
    private CategoryMapper categoryMapper;


    public PageInfo getAllBookMarks(int pageNum,int categoryId) {
        PageHelper.startPage(pageNum,46);
        List<Bookmark> bookMarks = bookmarkMapper.getAllBookMarks(categoryId);
        PageInfo pageInfo = new PageInfo(bookMarks);
        return pageInfo;
    }

    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }

    @Transactional
    public int deleteById(int id) {
        return bookmarkMapper.deleteById(id);
    }

    @Transactional
    public int changeCategoryById(int id, int categoryId) {
        return bookmarkMapper.changeCategoryById(id,categoryId);
    }
}

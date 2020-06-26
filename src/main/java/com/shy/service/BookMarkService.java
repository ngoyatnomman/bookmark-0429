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
    private BookmarkMapper bookmarkMapper;
    private CategoryMapper categoryMapper;

    public BookMarkService(BookmarkMapper bookmarkMapper, CategoryMapper categoryMapper) {
        this.bookmarkMapper = bookmarkMapper;
        this.categoryMapper = categoryMapper;
    }

    public PageInfo<Bookmark> getAllBookMarks(int pageNum, int categoryId) {
        PageHelper.startPage(pageNum,46);
        List<Bookmark> bookMarks = bookmarkMapper.getAllBookMarks(categoryId);
        return new PageInfo<>(bookMarks);
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

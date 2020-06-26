package com.shy.controller;

import com.github.pagehelper.PageInfo;
import com.shy.pojo.Category;
import com.shy.service.BookMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookMarkController {
    @Autowired
    private BookMarkService service;

    @PostMapping("/getAllBookMarks.do")
    public PageInfo getAllBookMarks(int pageNum,int categoryId){
        return service.getAllBookMarks(pageNum,categoryId);
    }

    @GetMapping("/getAllCategories.do")
    public List<Category> getAllCategories(){
        return service.getAllCategories();
    }

    @PostMapping("/deleteById.do")
    public int deleteById(int id){
        return service.deleteById(id);
    }

    @PostMapping("/changeCategoryById.do")
    public int changeCategoryById(int id,int categoryId){
        return service.changeCategoryById(id,categoryId);
    }
}

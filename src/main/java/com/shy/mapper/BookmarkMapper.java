package com.shy.mapper;

import com.shy.pojo.Bookmark;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookmarkMapper{

    @Select("<script>" +
            " select * from bookmark\n " +
            "        <if test=\"categoryId != 0\">\n" +
            "            where categoryId = #{categoryId}\n" +
            "        </if> " +
            "</script>")
    List<Bookmark> getAllBookMarks(@Param("categoryId") int categoryId);

    @Delete("delete from bookmark where id = #{id}")
    int deleteById(int id);

    @Update("update bookmark set categoryId = #{categoryId} where id = #{id}")
    int changeCategoryById(@Param("id") int id, @Param("categoryId") int categoryId);
}
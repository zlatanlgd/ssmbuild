package cn.medical.dao;

import cn.medical.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookMapper {
    // 增加一本书
    int addBook(Books books);
    // 删除一本书
    int deleteBookById(@Param("bookid") int id);
    // 更新一本书
    int updateBook(Books books);
    // 查询一本书
    Books queryBookById(@Param("bookid") int id);
    // 查询全部的书
    List<Books> queryAllBooks();
    //
    Books queryBookByName(@Param("bookName") String bookName);
}

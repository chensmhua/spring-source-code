package com.chenhd.tx.annotation.service;

import com.chenhd.tx.annotation.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class BookService {

    @Autowired
    BookDao bookDao;

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    /**
     * 结账：传入哪个用户买了哪本书
     * @param username
     * @param id
     */
    @Transactional(propagation = Propagation.NESTED)
    public void checkout(String username,int id){

        //bookDao.addStock(id);
        bookDao.updateStock(id);
//        for (int i = 1 ;i>=0 ;i--)
//            System.out.println(10/i);
    }
}
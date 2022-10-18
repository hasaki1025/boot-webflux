package com.example.bootwebflux.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.bootwebflux.domain.Book;
import com.example.bootwebflux.service.BookService;
import com.example.bootwebflux.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author pcdn
* @description 针对表【book】的数据库操作Service实现
* @createDate 2022-10-18 16:57:21
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}





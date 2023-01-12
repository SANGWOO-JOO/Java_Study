package com.reflection.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;  // 객체 BookRepository > BookService

    BookRepository bookRepositoryWithOutInject;
}
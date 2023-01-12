package com.reflection.demo;


import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ContainerServiceTest {

    @Test
    public void getObject_BookRepository() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class); // Repository에서  @Autowired 된 객체 필드를 리턴 ..
        assertNotNull(bookRepository);
    }

    @Test
    public void getObject_BookService() {
        // @Autowired 를 적용하여 객체를 주입한 객체
        BookService bookService = ContainerService.getObject(BookService.class); //// BookService에서  @Autowired 된 객체 필드를 리턴 ..
        assertNotNull(bookService); //객체 bookService가 null이 아닌지 확인합니다.
        assertNotNull(bookService.bookRepository); //객체 bookService의  bookRepository가  null이 아닌지 확인합니다.
//        assertNotNull(bookService.bookRepositoryWithOutInject); // FAIL
    }
}
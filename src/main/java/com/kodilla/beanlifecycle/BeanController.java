package com.kodilla.beanlifecycle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {
    private final BookstoreManager bookstoreManager;

    public BeanController(BookstoreManager bookstoreManager) {
        this.bookstoreManager = bookstoreManager;
    }

    @GetMapping(path = "/createBean")
    public BookstoreManager getBookstoreManager(){
        return bookstoreManager;
    }
}

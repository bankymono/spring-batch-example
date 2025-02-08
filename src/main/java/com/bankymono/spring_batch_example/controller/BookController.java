package com.bankymono.spring_batch_example.controller;


import com.bankymono.spring_batch_example.entity.BookEntity;
import com.bankymono.spring_batch_example.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
@Slf4j
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping
    public List<BookEntity> getAll() {
        log.info("Handling findAll");
        return bookRepository.findAll();
    }
}

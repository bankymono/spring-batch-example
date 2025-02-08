package com.bankymono.spring_batch_example.batch;

import com.bankymono.spring_batch_example.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;


@Slf4j
public class BookAuthorProcessor implements ItemProcessor<BookEntity, BookEntity> {
    @Override
    public BookEntity process(BookEntity item) {
        log.info("Process author: {}", item);
        item.setAuthor("By " + item.getAuthor());
        return item;
    }
}

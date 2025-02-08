package com.bankymono.spring_batch_example.batch;

import com.bankymono.spring_batch_example.entity.BookEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemProcessor;

@Slf4j
public class BookTitleProcessor implements ItemProcessor<BookEntity, BookEntity> {
    @Override
    public BookEntity process(BookEntity item) throws Exception {
        log.info("Processing title for {}", item);
        item.setTitle(item.getTitle().toUpperCase());
        return item;
    }
}

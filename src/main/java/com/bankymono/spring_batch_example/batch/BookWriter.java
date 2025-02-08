package com.bankymono.spring_batch_example.batch;

import com.bankymono.spring_batch_example.entity.BookEntity;
import com.bankymono.spring_batch_example.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

@Slf4j
public class BookWriter implements ItemWriter<BookEntity> {
    private BookRepository bookRepository;


    @Override
    public void write(Chunk<? extends BookEntity> chunk) throws Exception {
        log.info("Writing: {}", chunk.getItems().size());
        bookRepository.saveAll(chunk.getItems());
    }
}

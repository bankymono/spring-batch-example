package com.bankymono.spring_batch_example.repository;

import com.bankymono.spring_batch_example.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}

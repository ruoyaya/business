package com.yikeo.business.repository;

import com.yikeo.business.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author WuJing
 * @version 0.1
 * @since 2019-06-27
 */
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    @Query(value = "select new Book(id, title, author, translator, description, language, " +
            "subject1, subject2, datetime, publisher, asin, uuid, cover) " +
            "from Book where id = ?1")
    Optional<Book> findById(Long id);
}
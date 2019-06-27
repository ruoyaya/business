package com.yikeo.business.service;

import com.yikeo.business.entity.Book;
import com.yikeo.business.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author WuJing
 * @version 0.1
 * @since 2019-06-27
 */
@Service
@Transactional
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findById(Long id) {
        Optional<Book> bookOptional = bookRepository.findById(id);
        if(bookOptional.isPresent()) {
            return bookOptional.get();
        } else {
            return new Book();
        }
    }

    public void save(Book book) {
        bookRepository.save(book);
    }

    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitle(title);
    }

}
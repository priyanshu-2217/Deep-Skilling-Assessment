package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service  // ✅ REQUIRED
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public void addBook() {
        bookRepository.save();
    }
}

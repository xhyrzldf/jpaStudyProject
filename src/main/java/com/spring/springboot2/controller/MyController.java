package com.spring.springboot2.controller;

import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.fasterxml.jackson.annotation.JsonView;
import com.google.common.collect.Lists;
import com.spring.springboot2.pojo.Author;
import com.spring.springboot2.pojo.Book;
import com.spring.springboot2.repository.AuthorRepository;
import com.spring.springboot2.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 22:07
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@RestController
public class MyController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Autowired
    public MyController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }


    @PostMapping("/init")
    public ResponseEntity initData(){
        Author lewis = new Author("Lewis");
        Author mark = new Author("Mark");
        Author peter = new Author("Peter");

        Book spring = new Book("Spring in Action");
        spring.getAuthors().addAll(Arrays.asList(lewis, mark));

        Book springboot = new Book("Spring Boot in Action");
        springboot.getAuthors().addAll(Arrays.asList(lewis, peter));
        List<Book> books = bookRepository.saveAll(Lists.newArrayList(spring, springboot));
        return ResponseEntity.ok(books);
    }

    @GetMapping("/authors")
    public List<Author> findAuthors(){
        return authorRepository.findAll();
    }

    @PostMapping("/authors")
    public Author saveAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @GetMapping("/books")
    @FastJsonView(exclude = {@FastJsonFilter(clazz = Author.class,props = {"books"})})
    public List<Book> findBooks(){
        return bookRepository.findAll();
    }

    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book){
        return bookRepository.save(book);
    }


}

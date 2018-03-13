package com.spring.springboot2.repository;

import com.spring.springboot2.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:42
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@RepositoryRestResource(path = "/books")
public interface BookRepository extends JpaRepository<Book, Integer> {

    Book findByName(String name);

    List<Book> findByNameContaining(String name);

}

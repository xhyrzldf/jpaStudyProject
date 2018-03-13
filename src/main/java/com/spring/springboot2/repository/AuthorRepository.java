package com.spring.springboot2.repository;

import com.spring.springboot2.pojo.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:43
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@RepositoryRestResource(path = "/authors")
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    Author findByName(String name);

    List<Author> findByNameContaining(String name);

}

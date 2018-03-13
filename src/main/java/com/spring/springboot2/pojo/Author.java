package com.spring.springboot2.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:39
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@EqualsAndHashCode(exclude = "books")
@ToString(exclude = "books")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Author implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JSONField
    private Integer id;

    @JSONField(ordinal = 1)
    private String name;

    @JSONField(ordinal = 2,label = "books")
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;


    public Author(String name) {
        super();
        this.name = name;
    }

}

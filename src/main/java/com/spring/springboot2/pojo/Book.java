package com.spring.springboot2.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:38
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@EqualsAndHashCode(exclude = "authors")
@ToString(exclude = "authors")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JSONField
    private Integer id;

    @JSONField(ordinal = 1)
    private String name;

    @JSONField(ordinal = 2,serialzeFeatures = SerializerFeature.DisableCircularReferenceDetect)
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "BOOK_AUTHOR",
            joinColumns = {
                    @JoinColumn(name = "BOOK_ID", referencedColumnName = "ID")},
            inverseJoinColumns = {
                    @JoinColumn(name = "AUTHOR_ID", referencedColumnName = "ID")})
    private Set<Author> authors;

    public Book(String name) {
        super();
        this.name = name;
        this.authors = new HashSet<>();
    }

    public Book(String name, Set<Author> authors) {
        super();
        this.name = name;
        this.authors = authors;
    }


}

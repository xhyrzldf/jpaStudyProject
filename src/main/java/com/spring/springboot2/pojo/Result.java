package com.spring.springboot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:05
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private RspPageInfo RspPageInfo;
    private List<Info> InfoList;
}

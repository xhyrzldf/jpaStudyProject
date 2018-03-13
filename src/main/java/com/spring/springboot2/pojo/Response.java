package com.spring.springboot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/13 20:04
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    private String ErrMsg;
    private int ErrCode;
    private Result Result;
}

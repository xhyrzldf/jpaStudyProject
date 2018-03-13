package com.spring.springboot2.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TotalRowNum : 1074
 * RowNum : 10
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RspPageInfo {

    private int TotalRowNum;
    private int RowNum;
}

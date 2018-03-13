package com.spring.springboot2;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.spring.springboot2.pojo.Response;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.stream.Stream;

/**
 * <p>Description : springboot2
 * <p>Date : 2018/3/11 0:42
 * <p>@author : Matrix [xhyrzldf@foxmail.com]
 */
public class ReallyLearnLombok {
    private Integer id;
    private String name;

    public static void main(String[] args) throws IOException {
        String jsonText;
        try (Stream<String> lines = Files.lines(new File("C:\\Users\\Administrator\\Desktop\\JsonData.txt").toPath(), Charset.forName("GBK"))) {
            jsonText = lines.reduce("", String::concat);
        }

        Response response = JSON.parseObject(jsonText, new TypeReference<Response>() {
        });
        response.getResult().getInfoList().forEach(info -> {
            System.out.println(info);
            System.out.println("==============================================\n");
        });

    }
}

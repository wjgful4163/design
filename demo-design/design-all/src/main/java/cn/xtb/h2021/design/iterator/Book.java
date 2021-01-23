package cn.xtb.h2021.design.iterator;

import lombok.Data;

/**
 * @Description 书，主要是返回书的名称
 * @Author wjgful
 * @Date 2021/1/23
 */
@Data
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }
}

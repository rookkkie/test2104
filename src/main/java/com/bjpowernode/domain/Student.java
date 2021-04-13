package com.bjpowernode.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author 北京动力节点
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student
{

    private String id;
    private String name;
    private int age;
    private String address;

}

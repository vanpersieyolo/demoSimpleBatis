package com.example.demomybatis.entity;

import lombok.Data;

@Data
public class Student {
    private Integer id;

    private String name;
    private String email;
    private String address;
    private String birthDay;
}

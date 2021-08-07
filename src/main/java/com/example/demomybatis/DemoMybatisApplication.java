package com.example.demomybatis;

import com.example.demomybatis.mapper.MapperStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMybatisApplication implements CommandLineRunner {

    @Autowired
    MapperStudent mapperStudent;


    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(mapperStudent.findAll());
        System.out.println(mapperStudent.findById(1));
    }
}

package com.example.demomybatis.mapper;

import com.example.demomybatis.entity.Student;
import com.example.demomybatis.mapper.base.MapperBase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperStudent extends MapperBase<Student> {
    @Select("select * from student")
    List<Student> findAll();

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(long id);
}

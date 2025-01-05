package com.example.sbmybatisplus;

import com.example.sbmybatisplus.mapper.MissavMapper;
import com.example.sbmybatisplus.mapper.UserMapper;
import com.example.sbmybatisplus.model.Missav;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SbMybatisPlusApplicationTests {

    @Autowired
    MissavMapper missavMapper;

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {

        List<Missav> list = missavMapper.selectList(null);

//list.stream().forEach();
        list.forEach(System.out::println);
//        System.out.print("aa");


        System.out.println(userMapper.selectById(3));
    }

    }



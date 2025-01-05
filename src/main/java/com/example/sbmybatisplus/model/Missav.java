package com.example.sbmybatisplus.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

@Data
public class Missav {

    private String name;
    private String types;
    @TableField("create_Time")
    private Date create_Time;
    private int id;
    private int views;

}

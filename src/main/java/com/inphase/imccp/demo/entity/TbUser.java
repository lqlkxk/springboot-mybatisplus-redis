package com.inphase.imccp.demo.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Date;


/**
 * @Description
 * @Author luojq <luojiaqiang@live.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2019/9/18 0018
 */
@Data
@TableName("tb_user")
public class TbUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private int age;



}

package com.demo.mall.entity;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Data
public class Notes {
    String id;
    int type;
    Date createTime;

}

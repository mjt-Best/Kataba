package com.mjt.dto;

import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;

/**
 * projectName: Kataba
 *
 * @author: 马江涛
 * time:2020/10/19  17:29
 * desription:映射实体类
 */
@Data
public class UserDto {
    private String phone;
    private String nname;
    private String pw;
}
package com.example.hellospringboot.entity;

import lombok.Data;

@Data
public class TUser {
    private Long id;

    private String name;

    private String password;

    private String phone;

}
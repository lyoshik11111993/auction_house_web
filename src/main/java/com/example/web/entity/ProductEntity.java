package com.example.web.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class ProductEntity {
    private int id;
    private String name;
    private int sellerId;
}

package com.example.web.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class BidEntity {
    private int id;
    private int size;
    private int buyerId;
    private int productId;
}

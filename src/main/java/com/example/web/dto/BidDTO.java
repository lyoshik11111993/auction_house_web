package com.example.web.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class BidDTO {
    private int size;
    private int buyerId;
    private int productId;
}

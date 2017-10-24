package com.example.web.validator;

import com.example.web.dto.BidDTO;
import com.example.web.dto.ProductDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BidValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return BidDTO.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        BidDTO bid = (BidDTO) o;
        if (StringUtils.isEmpty(bid.getSize())) {
            errors.rejectValue("size", "400", "Size should not be empty!");
        }
        if (StringUtils.isEmpty(bid.getBuyerId())) {
            errors.rejectValue("buyerId", "400", "Buyer`s ID should not be empty!");
        }
        if (StringUtils.isEmpty(bid.getProductId())) {
            errors.rejectValue("productId", "400", "Product`s ID should not be empty!");
        }
    }
}

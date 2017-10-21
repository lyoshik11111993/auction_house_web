package com.example.web.validator;

import com.example.web.dto.ProductDTO;
import com.example.web.dto.SellerDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ProductValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return ProductValidator.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ProductDTO product = (ProductDTO) o;
        if (StringUtils.isEmpty(product.getName())) {
            errors.rejectValue("name", "400", "Login should not be empty!");
        }
        if (StringUtils.isEmpty(product.getSellerId())) {
            errors.rejectValue("sellerId", "400", "Seller`s ID should not be empty!");
        }
    }
}

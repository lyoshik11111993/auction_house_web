package com.example.web.validator;

import com.example.web.dto.SellerDTO;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class SellerValidator implements Validator{
    @Override
    public boolean supports(Class<?> aClass) {
        return SellerDTO.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        SellerDTO seller = (SellerDTO) o;
        if (StringUtils.isEmpty(seller.getName())) {
            errors.rejectValue("name", "400", "Login should not be empty!");
        }
    }
}

package com.example.web.controller.insert;

import com.example.web.config.AppPaths;
import com.example.web.dto.BuyerDTO;
import com.example.web.dto.SellerDTO;
import com.example.web.intrf.BuyerService;
import com.example.web.intrf.SellerService;
import com.example.web.validator.BuyerValidator;
import com.example.web.validator.SellerValidator;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class InsertBuyerController {
    private final BuyerService buyerService;
    private final BuyerValidator buyerValidator;

    @InitBinder
    public void binder(WebDataBinder binder) {
        binder.setValidator(buyerValidator);
    }

    @RequestMapping(value = AppPaths.INSERT_BUYER, method = RequestMethod.POST)
    public String save(@Validated BuyerDTO buyer, BindingResult bindingResult, Model model) throws SQLException {
        if (bindingResult.hasErrors()) {
            Map<String, String> errors = new HashMap<>();
            bindingResult.getAllErrors().
                    forEach(error -> errors.put(((FieldError)error).getField(), error.getDefaultMessage()));
            model.addAttribute("errors", errors);
            model.addAttribute("buyer", buyer);
            return "insert";
        }
        buyerService.save(buyer);
        return "success";
    }
}

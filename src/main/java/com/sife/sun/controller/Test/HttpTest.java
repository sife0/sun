package com.sife.sun.controller.Test;

import com.sife.sun.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sun")
public class HttpTest {

    @Autowired
    ProductService productService;

    @RequestMapping("/buyProduct")
    void buyProduct(String productCode) {
        productService.buyProduct(productCode);
    }

}

package com.sife.sun.service.product.impl;

import com.sife.sun.dao.product.ProductMapper;
import com.sife.sun.pojo.product.Product;
import com.sife.sun.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public synchronized void buyProduct(String productCode) {
        Product product = productMapper.queryByProductCode(productCode);
        int num = product.getNumber();
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("productCode", productCode);
        paramMap.put("number", --num);
        productMapper.updateByProductCode(paramMap);
    }

}

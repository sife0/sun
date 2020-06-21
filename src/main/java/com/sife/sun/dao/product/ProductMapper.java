package com.sife.sun.dao.product;

import com.sife.sun.pojo.product.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface ProductMapper {

    Product queryByProductCode(String productCode);

    void updateByProductCode(Map<String, Object> paramMap);

}

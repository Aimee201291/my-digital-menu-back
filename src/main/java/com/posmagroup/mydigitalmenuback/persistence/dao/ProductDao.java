package com.posmagroup.mydigitalmenuback.persistence.dao;

import com.posmagroup.mydigitalmenuback.dto.Product;
import com.posmagroup.mydigitalmenuback.persistence.model.ProductEntity;

import java.util.List;

public interface ProductDao {

    public ProductEntity saveProduct(ProductEntity productEntity);

    public List<ProductEntity> getAllProducts();
}
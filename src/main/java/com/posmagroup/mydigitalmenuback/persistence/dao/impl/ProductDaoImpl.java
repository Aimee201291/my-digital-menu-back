package com.posmagroup.mydigitalmenuback.persistence.dao.impl;

import com.posmagroup.mydigitalmenuback.dto.Product;
import com.posmagroup.mydigitalmenuback.persistence.dao.ProductDao;
import com.posmagroup.mydigitalmenuback.persistence.model.ProductEntity;
import com.posmagroup.mydigitalmenuback.persistence.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private ProductRepository productRepository;

    public ProductEntity saveProduct(ProductEntity productEntity) {
        productEntity = productRepository.save(productEntity);
        return productEntity;
    }

    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> products = (List<ProductEntity>) productRepository.findAll();
        return products;
    }

}
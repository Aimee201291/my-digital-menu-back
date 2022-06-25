package com.posmagroup.mydigitalmenuback.business.impl;

import com.posmagroup.mydigitalmenuback.business.ProductBF;
import com.posmagroup.mydigitalmenuback.dto.Product;
import com.posmagroup.mydigitalmenuback.persistence.dao.ProductDao;
import com.posmagroup.mydigitalmenuback.persistence.model.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lindsay Posma on 20/06/2022.
 */
@Service
public class ProductBFImpl implements ProductBF {

    private static final Logger logger = LoggerFactory.getLogger(ProductBFImpl.class);

    @Autowired
    private ProductDao productDao;

    @Override
    public Product save(Product product) {

        try {
            ProductEntity productEntity = new ProductEntity();
            if (product.getName() != null) {
                productEntity.setName(product.getName());

                productDao.saveProduct(productEntity);
            /*} else {

            }*/
            }
        } catch (Exception e) {
            logger.error("Exception + ", e);
        }

        return product;
    }

    public List<Product> getAll() {

        List<ProductEntity> productsEntity = productDao.getAllProducts();

        List<Product> products =  new ArrayList<>();

        Product product;

        for (ProductEntity productEntity : productsEntity) {
            product = new Product();
            product.setName(productEntity.getName());
            products.add(product);
        }

        return products;
    }
}
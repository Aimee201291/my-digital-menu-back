package com.posmagroup.mydigitalmenuback.business;

import com.posmagroup.mydigitalmenuback.dto.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by Lindsay Posma on 20/06/2022.
 */
public interface ProductBF {

    public Product save(Product product);
    public List<Product> getAll();
}
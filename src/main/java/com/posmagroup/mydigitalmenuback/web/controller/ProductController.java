package com.posmagroup.mydigitalmenuback.web.controller;

import com.posmagroup.mydigitalmenuback.business.ProductBF;
import com.posmagroup.mydigitalmenuback.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Lindsay Posma on 20/06/2022.
 */

@CrossOrigin(origins = {"http://localhost:8100", "http://localhost:4200"})
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductBF productBF;

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product) {
        return new ResponseEntity<>(productBF.save(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(productBF.getAll(), HttpStatus.OK);
    }
}
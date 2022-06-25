package com.posmagroup.mydigitalmenuback.persistence.repository;

import com.posmagroup.mydigitalmenuback.persistence.model.ProductEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

}
package com.springboot.demo.repository;

import com.springboot.demo.domain.ItemEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity,String> {
}

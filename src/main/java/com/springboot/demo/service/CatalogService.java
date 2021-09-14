package com.springboot.demo.service;


import com.springboot.demo.domain.ItemDTO;

public interface CatalogService {
    Iterable<ItemDTO> getItems();
}

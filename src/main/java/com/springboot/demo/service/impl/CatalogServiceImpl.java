package com.springboot.demo.service.impl;

import com.springboot.demo.domain.ItemDTO;
import com.springboot.demo.repository.ItemRepository;
import com.springboot.demo.service.CatalogService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final ItemRepository itemRepository;

    public CatalogServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<ItemDTO> getItems() {
        return StreamSupport.stream(itemRepository.findAll().spliterator(), false)
                .map(entity -> new ItemDTO(entity.getTitle(), entity.getPrice()))
                .collect(Collectors.toList());
    }
}

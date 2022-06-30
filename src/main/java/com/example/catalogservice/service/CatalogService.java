package com.example.catalogservice.service;


import com.example.catalogservice.model.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}

package com.gabchak.services;

import com.gabchak.models.Product;

import java.util.Set;

public interface ConverterService {

    void convert(Set<Product> productSet, String filePath);
}

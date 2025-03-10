package dev.naman.productservice.services;

import dev.naman.productservice.dtos.CategoryDto;
import dev.naman.productservice.dtos.GenericProductDto;
import dev.naman.productservice.exceptions.NotFoundException;

import java.util.List;

public interface CategoryService {

    List<GenericProductDto> getProductsByACategory(String categoryName) throws NotFoundException;

    List<CategoryDto> getAllCategories();
}

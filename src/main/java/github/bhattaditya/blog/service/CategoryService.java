package github.bhattaditya.blog.service;

import github.bhattaditya.blog.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto createCategory(CategoryDto categoryDto);
    List<CategoryDto> getCategories();
    CategoryDto getCategory(Long categoryId);
    CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto);
    void removeCategory(Long categoryId);
}

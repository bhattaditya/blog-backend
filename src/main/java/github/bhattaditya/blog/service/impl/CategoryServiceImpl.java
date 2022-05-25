package github.bhattaditya.blog.service.impl;

import github.bhattaditya.blog.payload.CategoryDto;
import github.bhattaditya.blog.repository.CategoryRepository;
import github.bhattaditya.blog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        return null;
    }

    @Override
    public List<CategoryDto> getCategories() {
        return null;
    }

    @Override
    public CategoryDto getCategory(Long categoryId) {
        return null;
    }

    @Override
    public CategoryDto updateCategory(Long categoryId, CategoryDto categoryDto) {
        return null;
    }

    @Override
    public void removeCategory(Long categoryId) {

    }
}

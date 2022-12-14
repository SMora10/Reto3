package com.usa.misiontic.reto3.reto3.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usa.misiontic.reto3.reto3.entities.Category;
import com.usa.misiontic.reto3.reto3.repository.crudRepository.CategoryCrudRepository;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll(){
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getCategory(int id){
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category c){
        return categoryCrudRepository.save(c);
    }
    public void delete(Category c){
    categoryCrudRepository.delete(c);
    }
}

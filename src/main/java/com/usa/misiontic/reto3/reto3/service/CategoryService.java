package com.usa.misiontic.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usa.misiontic.reto3.reto3.entities.Category;
import com.usa.misiontic.reto3.reto3.repository.CategoryRepository;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
    public Optional<Category> getProduct(int id){
        return categoryRepository.getCategory(id);
    }
    public Category save(Category p){
        if(p.getId() == null){
            return categoryRepository.save(p);
        }else{
            Optional<Category> e = categoryRepository.getCategory(p.getId());
            if(e.isPresent()){
                return e.get();
            }else{
                return categoryRepository.save(p);
            }
        }

    }

    public Category update(Category p){
        if(p.getId() != null){
            Optional<Category> q = categoryRepository.getCategory(p.getId());
            if(q.isPresent()){
                if(p.getName() != null){
                    q.get().setName(p.getName());
                }
                categoryRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(int id){
        boolean flag=false;
Optional<Category>p=categoryRepository.getCategory(id);
if(p.isPresent()){
    categoryRepository.delete(p.get());
    flag=true;
}


        return flag;
    }
}


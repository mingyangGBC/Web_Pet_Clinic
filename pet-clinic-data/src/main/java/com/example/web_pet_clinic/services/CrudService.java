package com.example.web_pet_clinic.services;

import com.example.web_pet_clinic.model.Owner;

import java.util.Set;

public interface CrudService <T, ID>{

    Set<T> findAll();
    T findById(Long id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}

package com.example.web_pet_clinic.services;

import com.example.web_pet_clinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastname(String lastname);
}

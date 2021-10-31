package com.example.web_pet_clinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType getType;
    private Owner owner;
    private LocalDate birthdate;

    public PetType getGetType() {
        return getType;
    }

    public void setGetType(PetType getType) {
        this.getType = getType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}

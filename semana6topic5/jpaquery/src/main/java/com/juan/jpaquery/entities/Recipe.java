package com.juan.jpaquery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @Column(name = "cocktail")
    private String cocktail;

    @Column
    private String instructions;

    public Recipe() {

    }

    public Recipe(String cocktail, String instructions) {
        this.cocktail = cocktail;
        this.instructions = instructions;
    }

    public String getCocktail() {
        return cocktail;
    }

    public void setCocktail(String cocktail) {
        this.cocktail = cocktail;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}

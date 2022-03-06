package com.juan.jpaquery.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "multiple_recipes")
public class MultipleRecipe {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "cocktail")
    private String cocktail;

    @Column(name = "instructions")
    String instructions;

    @Column(name = "base_ingredients")
    private String baseIngredients;

    public MultipleRecipe() {

    }

    public MultipleRecipe(Long id, String cocktail, String instructions, String baseIngredients) {
        this.id = id;
        this.cocktail = cocktail;
        this.instructions = instructions;
        this.baseIngredients = baseIngredients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getBaseIngredients() {
        return baseIngredients;
    }

    public void setBaseIngredients(String baseIngredients) {
        this.baseIngredients = baseIngredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MultipleRecipe that = (MultipleRecipe) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(cocktail, that.cocktail) &&
                Objects.equals(instructions, that.instructions) &&
                Objects.equals(baseIngredients, that.baseIngredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cocktail, instructions, baseIngredients);
    }
}

package com.juan.jpaquery.entities;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")
public class Cocktail {

    @Id
    @Column(name = "cocktail_name")
    private String name;

    @Column
    private double price;

    @Column
    private String category;

    @OneToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "cocktail_name",
        referencedColumnName = "cocktail",
        insertable = false, updatable = false,
        foreignKey = @javax.persistence.ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private Recipe recipe;

    @OneToMany(fetch = FetchType.LAZY)
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(
            name = "cocktail",
            referencedColumnName = "cocktail_name",
            insertable = false,
            updatable = false,
            foreignKey = @javax.persistence
                    .ForeignKey(value = ConstraintMode.NO_CONSTRAINT))
    private List<MultipleRecipe> recipeList;

    public Cocktail() {

    }

    public Cocktail(String name, double price, String baseIngredients) {
        this.name = name;
        this.price = price;
        this.category = baseIngredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

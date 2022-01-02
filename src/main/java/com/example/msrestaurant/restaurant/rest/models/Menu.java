package com.example.msrestaurant.restaurant.rest.models;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class Menu {

    private String menuName;

    private List<Meal> meals;

    @NotEmpty
    private String extra;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}

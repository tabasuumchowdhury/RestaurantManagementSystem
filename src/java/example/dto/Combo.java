package org.example.dto;

import java.sql.SQLOutput;

public class Combo {
    private static final int MAX_DISH_NUM = 2;
    private static final int MAX_BEVERAGE_NUM = 2;
    private static int nextId = 1;

    private String id;
    private String name;
    private double price;
    private Dish[] dishes;
    private Beverage[] beverages;

    public Combo(String name) {
        this.id = String.format("D%03d", nextId++);
        this.name = name;
        this.price = price;
        this.dishes = new Dish[MAX_DISH_NUM];
        this.beverages = new Beverage[MAX_BEVERAGE_NUM];
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
        } else if (dishes[1] == null) {
            dishes[1] = dish;
        } else {
            System.out.printf("There are already %d dishes. Add dishes failed", MAX_DISH_NUM);
        }
    }

    public void addBeverage(Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
        } else if (beverages[1] == null) {
            beverages   [1] = beverage;
        } else {
            System.out.printf("There are already %d beverages. Add dishes failed", MAX_BEVERAGE_NUM);
        }
    }

    public void calcPrice() {
        double price = 0;
        for (Beverage beverage : beverages) {
            if (beverage != null) {
                price += beverage.getPrice();
            }
        }

        for (Dish dish : dishes) {
            if (dish != null) {
                price += dish.getPrice();
            }
        }

        double discountRatio = 0.8;
        this.price = price * discountRatio;
    }
}

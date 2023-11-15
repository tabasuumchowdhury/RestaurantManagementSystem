package org.example;


import org.example.dto.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem1 = new RestaurantManagementSystem();
        Dish dish1 = new Dish("French fries", 2.99, FoodType.VEGE);
        Beverage beverage1 = new Beverage("Coke", 1.99, false);
        Combo combo1 = new Combo("Coke & Fries");


    }
}
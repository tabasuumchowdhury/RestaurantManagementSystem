package org.example.dto;
import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Beverage {
    private static int nextId = 1;

    private String id;
    private String name;
    private double price;
    private boolean isAcoholic;

    public Beverage(String name, double price, boolean isAcoholic) {
        this.id = String.format("D%03d", nextId++);
        this.name = name;
        this.price = price;
        this.isAcoholic = isAcoholic;
    }
}

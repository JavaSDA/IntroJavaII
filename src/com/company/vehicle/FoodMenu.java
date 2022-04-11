package com.company.vehicle;

public enum FoodMenu {

    APPETIZER("Steamed Prawn", "Cafe latte"),
    DESSERT("Cupcakes", "Milk and Chocolate Ice cream");

    private final String firstItem;
    private final String secondItem;

    FoodMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }
}

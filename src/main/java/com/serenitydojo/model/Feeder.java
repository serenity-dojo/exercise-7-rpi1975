package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(String animal, boolean isPremium) {
        switch (animal){
            case "Cat" :
                return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
            case "Dog" :
                return FoodType.DOG_FOOD;
            case "Hamster" :
                return FoodType.CABBAGE;
            default:
                return FoodType.UNKNOWN;
        }
    }
}

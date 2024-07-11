package ru.kors;

import java.util.List;

public class HomeDress implements ClothesStrategy {
    @Override
    public List<Clothes> getClothes() {
        return List.of(new Clothes("T-Shirt"), new Clothes("Shorts"));
    }
}

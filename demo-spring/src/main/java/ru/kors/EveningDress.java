package ru.kors;

import java.util.List;

public class EveningDress implements ClothesStrategy {
    @Override
    public List<Clothes> getClothes() {
        return List.of(new Clothes("Tuxedo"));
    }
}

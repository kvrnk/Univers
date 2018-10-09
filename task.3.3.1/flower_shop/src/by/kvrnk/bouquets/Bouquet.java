package by.kvrnk.bouquets;

import by.kvrnk.flowers.Flower;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers = new ArrayList<Flower>();
    private BigDecimal price = BigDecimal.ZERO;

   public void addFlower(Flower flower, int quantity) {
        flowers.add(flower);
        price = price.add(flower.getPrice().multiply(BigDecimal.valueOf(quantity)));
    }

    public BigDecimal getPrice() {
        return price;
    }
}

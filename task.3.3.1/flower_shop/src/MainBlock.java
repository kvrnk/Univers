import by.kvrnk.bouquets.Bouquet;
import by.kvrnk.flowers.Cactus;
import by.kvrnk.flowers.Chamomile;

public class MainBlock {
    public static void main(String[] args) {
        Chamomile chamomile = new Chamomile();
        Cactus cactus = new Cactus();

        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(chamomile,10);
        bouquet.addFlower(cactus, 2);

        System.out.println(bouquet.getPrice());
    }
}

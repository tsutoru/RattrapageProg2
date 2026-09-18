package tsutsu.rattrapageprog2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tsutsu.rattrapageprog2.entity.*;

@SpringBootTest
class RattrapageProg2ApplicationTests {

    @Test
    void TheTotalAmountInCommande() {
        Clothes clothes = new Clothes(1,"Balenciaga", Size.XS, Material.coton, 10000.00);
        TopClothes topClothes = new TopClothes(Sleeves.Long);
        BottomClothes bottomClothes = new BottomClothes(15);
        Order order = new Order();
        Client client = new Client("0332067898", "Rakoto@gmail.com", "125Lotanihoany",1999-10-22 );

        double amount = 0.0;

    }

}

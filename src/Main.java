import br.com.alura.models.PerishableProduct;
import br.com.alura.models.Products;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Products> productsList = new ArrayList<>();

        Products product01 = new Products("Camiseta", 150, 5);
        Products product02 = new Products("Calça", 180, 10);
        Products product03 = new Products("Shorts", 119.8, 3);
        Products product04 = new Products("Meia", 30.5, 8);

        PerishableProduct product05 = new PerishableProduct("Picanha", 89.90, 15, LocalDate.of(2024, 11, 4));

        productsList.add(product01);
        productsList.add(product02);
        productsList.add(product03);
        productsList.add(product04);
        productsList.add(product05);


        for (Products products : productsList) {
            System.out.println("--------------------------");
            System.out.println(products);
            System.out.println("--------------------------");
        }
    }
}
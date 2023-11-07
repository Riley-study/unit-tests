package seminars.first.hw;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ShopTest {

    public static void main(String[] args) {
        Product prod1 = new Product();
        prod1.setCost(100);
        prod1.setTitle("orange");
        Product prod2 = new Product();
        prod2.setCost(60);
        prod2.setTitle("chocolate");
        Product prod3 = new Product();
        prod3.setCost(500);
        prod3.setTitle("meet");
        Product prod4 = new Product();
        prod4.setCost(250);
        prod4.setTitle("mango");

        List<Product> products = new ArrayList<>();
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);

       for (Product pr: products) {
           System.out.println(pr.getTitle() + " " + pr.getCost());
       }

        Shop shop = new Shop();
        shop.setProducts(products);
        List<Product> sortedList = new ArrayList<>();
        sortedList = shop.getSortedListProducts();

        System.out.println("\nSorted list of products:");
        for (Product pr: sortedList) {
            System.out.println(pr.getTitle() + " " + pr.getCost());
        }
        Product maxCostProduct = shop.getMostExpensiveProduct();

      //  1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)

      assertThat(products).hasToString("[chocolate 60, orange 100, mango 250, meet 500]");

        //  2. Проверить, что магазин возвращает верный самый дорогой продукт getMostExpensiveProduct
        Product testMaxCost = prod3;

        assertThat(maxCostProduct).isEqualTo(testMaxCost);

        // 3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов

        List<Product> testListOfProducts = new ArrayList<>();
        testListOfProducts.add(prod2);
        testListOfProducts.add(prod1);
        testListOfProducts.add(prod4);
        testListOfProducts.add(prod3);

        assertThat(sortedList).isEqualTo(testListOfProducts);

    }

}





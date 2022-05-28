package nguyentientho.java_8.lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpression_2 {
    static class Product {
        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        lambdaFilterCollection();
    }

    public static void lambdaFilterCollection() {
        List<Product> pList = new ArrayList<>();
        pList.add(new Product(1, "margin", 1000.12f));
        pList.add(new Product(2, "Transaction", 2000.22f));
        pList.add(new Product(3, "Corporate Action", 3000.33f));
        pList.add(new Product(4, "Product Sale", 4000.44f));
        pList.add(new Product(5, "Customer care", 5000.55f));

        Stream<Product> streamP = pList.stream().filter(p -> p.price > 2000.55f);

        streamP.forEach(p -> System.out.println(p.name + " : " + p.price));
    }
}

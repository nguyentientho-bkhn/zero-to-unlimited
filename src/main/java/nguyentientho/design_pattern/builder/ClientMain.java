package nguyentientho.design_pattern.builder;

import nguyentientho.design_pattern.builder.model.BreadType;
import nguyentientho.design_pattern.builder.model.OrderType;
import nguyentientho.design_pattern.builder.model.VegetableType;

public class ClientMain {
    public static void main(String[] args) {
        Product product = new OrderBuilderImpl()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.CHICKEN)
                .orderVegetable(VegetableType.SALAD)
                .build();
        System.out.println(product);
    }
}

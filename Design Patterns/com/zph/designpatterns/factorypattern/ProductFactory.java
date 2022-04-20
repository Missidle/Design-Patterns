package com.zph.designpatterns.factorypattern;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static final Map<String,Product> prMap = new HashMap<>();
    public static synchronized Product createProduct(String type) throws Exception{
        Product product = null;
        if (prMap.containsKey(type)){
            product = prMap.get(type);
        }else {
            if (type.equals("Product1")){
                product = new ConcretProduct1();
            } else {
                product = new ConcretProduct1();
            }
            prMap.put(type,product);
        }
        return product;
    }
}

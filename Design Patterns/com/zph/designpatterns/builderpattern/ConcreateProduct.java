package com.zph.designpatterns.builderpattern;

public class ConcreateProduct extends Builder{
    private Product product = new Product();
    @Override
    public void setPart() {
        /**
         * 产品类内的内部逻辑处理
         */
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}

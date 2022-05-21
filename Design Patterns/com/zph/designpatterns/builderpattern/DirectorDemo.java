package com.zph.designpatterns.builderpattern;

public class DirectorDemo {
    private Builder builder = new ConcreateProduct();

    //构建不同的产品
    public Product getAProduct(){
        builder.setPart();
        /**
         * 设置不同的零件,产生不同的产品
         */
        return builder.buildProduct();
    }
}

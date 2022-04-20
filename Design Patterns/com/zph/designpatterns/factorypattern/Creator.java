package com.zph.designpatterns.factorypattern;

public abstract class Creator {
    /**
     * 创建一个产品对象，输入参数类型可以自行设置
     * 通常为String、Enum、Class或者为空
     */
    public abstract <T extends Product> T createProduct(Class<T> c);
}

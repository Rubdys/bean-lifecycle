package com.kodilla.beanlifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class BookstoreManager implements BeanNameAware {

    public String name;

    @Override
    public void setBeanName(String name) {
        this.name = name;
        System.out.println("Name of the bean: " + name);
    }
}

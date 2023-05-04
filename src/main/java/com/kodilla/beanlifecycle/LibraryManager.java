package com.kodilla.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class LibraryManager implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, InitializingBean, DisposableBean {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        beanName = name;
        System.out.println("Name of the bean: " + name);

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("Class loader instance passed");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory instance passed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }

    @PostConstruct
    public void postConstructorMethod(){
        System.out.println("Method with @PostConstructor annotation");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Method destroy has been called");
    }

    @PreDestroy
    public void preDestroyMethod(){
        System.out.println("Method with @PreDestroy annotation");
    }

}

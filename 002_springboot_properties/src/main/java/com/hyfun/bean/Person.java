package com.hyfun.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:vae.properties")
public class Person {
    @Value("${name}")
    private String name;
    private Integer age;
    private Integer height;
    private Boolean isMen;

    public Person() {
    }

    public Person(String name, Integer age, Integer height, Boolean isMen) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.isMen = isMen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Boolean getMen() {
        return isMen;
    }

    public void setMen(Boolean men) {
        isMen = men;
    }

    @Override
    public String toString() {
        return "Persion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isMen=" + isMen +
                '}';
    }
}

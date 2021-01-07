package com.hyfun;

import com.hyfun.bean.Dog;
import com.hyfun.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
    @Autowired
    private Person person;

    @Autowired
    private Dog dog;
    @Test
    void contextLoads() {
        System.out.println(person);
        System.out.println("-------------------");
        System.out.println(dog);
    }

}

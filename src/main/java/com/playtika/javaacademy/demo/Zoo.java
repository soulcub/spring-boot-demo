package com.playtika.javaacademy.demo;

import java.util.HashMap;
import java.util.Map;

import lombok.ToString;
import org.joda.time.DateTimeUtils;

@ToString
public class Zoo {

    private Map<Long, Dog> dogs = new HashMap<>();

    public void addDog(Dog dog) {
        long key = DateTimeUtils.currentTimeMillis();
        dogs.put(key, dog);
    }

    public Dog get(long ts) {
        return dogs.get(ts);
    }
}

package com.telnova.runners.lesson19;

import com.telnova.app.classwork.lesson19.TrainingCenter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Мир on 26.05.2017.
 */
public class TrainingRunner {
    public static void main(String[] args) {
        TrainingCenter kit = new TrainingCenter();
        kit.name = "KIT";
        TrainingCenter bio = new TrainingCenter();
        bio.name = "BIO";

        Map<TrainingCenter, Integer> map = new HashMap(32);//integer потому что value  integer
        map.put(kit, 13);
        map.put(bio, 12);
        System.out.println(map);
        System.out.println(map.entrySet()); // можно исп-ть для for each, но в Мар нужно указать <TrainingCenter, Integer>
        for (Map.Entry<TrainingCenter, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

package com.telnova.runners;

import com.telnova.app.classwork.lesson14.inkaps_Car;

/**
 * Created by Мир on 15.03.2017.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        inkaps_Car car = new inkaps_Car();
        //car.name = "BMW";
      //  System.out.println(car.name);
        car.setName("BMW");
        System.out.println(car.getName());
    }
}

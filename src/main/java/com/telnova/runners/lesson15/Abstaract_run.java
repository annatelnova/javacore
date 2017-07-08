package com.telnova.runners.lesson15;

import com.telnova.app.classwork.lesson15.Abstract_House;
import com.telnova.app.classwork.lesson15.ObolonPlaza;

/**
 * Created by Мир on 05.05.2017.
 */
public class Abstaract_run {
    public static void main(String[] args) {
        //ObolonPlaza obolonPlaza = new ObolonPlaza();
        Abstract_House obolonPlaza = new ObolonPlaza(); //полиморфизм
        obolonPlaza.build("Monolit");
    }

}


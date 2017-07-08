package com.telnova.app.classwork.lesson18;

/**
 * Created by Мир on 23.05.2017.
 */
public class Browser {
    private String name;
    private int version;
    public void invoke (String name){
        System.out.println(name);
    }
    public void invoke (String name, int version){
        invoke(name);// как в конструкторе со словом this
        System.out.print(" " + version);
    }
}

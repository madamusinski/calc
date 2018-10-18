package com.github.madamusinski;

public abstract class Calculator {

    abstract void initialize();
    abstract void showMenu();


    /**
     * Template method
     */

    public final void run(){
        initialize();
        showMenu();
    }
}

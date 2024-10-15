package org.example;

public class Button {
    private int clickCount;
    Button(){
        System.out.println("Created new button");
    }
    private int i;
    public void click(){
        clickCount++;
        System.out.println("Button was clicked " + clickCount + " times");
    }
}

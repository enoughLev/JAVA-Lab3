package org.example;

public class Button {
    private int clickCount;
    private int i;
    public void click(){
        clickCount++;
        System.out.println("Button was clicked " + clickCount + " times");
    }
}

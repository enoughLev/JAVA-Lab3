package org.example;

public class Bell {
    private int even_odd;

    public void sound(){
        even_odd++;
        if(even_odd % 2 == 0) System.out.print("Dong? ");
        else System.out.print("Ding? ");
    }
}

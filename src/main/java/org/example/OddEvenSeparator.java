package org.example;
import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private List<Integer> odd;
    private List<Integer> even;

    OddEvenSeparator(){
        odd = new ArrayList<>();
        even = new ArrayList<>();
    }

    public void addNumber(int new_num){
        if(new_num == 0) even.add(new_num);
        else if(new_num%2 == 0) even.add(new_num);
        else odd.add(new_num);
    }

    public void odd(){
        System.out.print("Odd numbers: ");
        for(int i : odd) System.out.print(i + " ");
        System.out.println();
    }

    public void even(){
        System.out.print("Even numbers: ");
        for(int i : even) System.out.print(i + " ");
        System.out.println();
    }
}

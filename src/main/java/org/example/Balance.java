package org.example;

public class Balance {
    private int leftWeight = 0;
    private int rightWeight = 0;

    public void addLeft(int weight){
        leftWeight += weight;
    }

    public void addRight(int weight){
        rightWeight += weight;
    }

    public void result(){
        if(leftWeight == rightWeight) System.out.print("= ");
        else if (leftWeight < rightWeight) System.out.print("R ");
        else System.out.print("L ");
    }
}

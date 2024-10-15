package org.example;

import java.util.Arrays;

public class Table {
    private int[][] numbers;
    Table(int rows, int cols){
        numbers = new int[rows][cols];
    }
    public void getValue(int row, int col){
        System.out.println(numbers[row][col] + " at (" + row + ", " + col + ") position");
    }

    public void setValue(int row, int col, int val){
        numbers[row][col] = val;
    }

    public void rows(){
        System.out.println("In table " + numbers[0].length + " rows!");
    }

    public void cols(){
        System.out.println("In table " + numbers[1].length + " columns!");
    }

    public String toString(){
        for(int[] i : numbers){
            System.out.println(Arrays.toString(i) + " ");
        }
        return "";
    }

    public double average(){
        int divider = 0;
        int summary = 0;
        for(int[] r : numbers){
            for(int c : r){
                summary += c;
                divider++;
            }
        }
        return (double) summary /divider;
    }
}

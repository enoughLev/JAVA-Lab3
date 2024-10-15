package org.example;

public class Main {
    public static void main(String[] args) {
        //TIP 1
        System.out.print("\t1. Counting click on button time's:\n");
        Button newButton = new Button();
        int n = 5;
        for (int i = 0; i < n; i++) newButton.click();

        //TIP 2
        System.out.print("\n\t2. Balance: ");
        Balance newBalance = new Balance();
        newBalance.addLeft(15);
        newBalance.addRight(15);
        newBalance.result();
        newBalance.addRight(15);
        newBalance.result();
        newBalance.addLeft(30);
        newBalance.result();

        //TIP 3
        System.out.print("\n\n\t3. Ding-Dong\n");
        int dindonging = 10;
        Bell newBell = new Bell();
        for (int i=0; i<dindonging; i++) {
            newBell.sound();
        }
        System.out.println("\n");

        //TIP 4
        System.out.print("\t4. Separation the numbers\n");
        int number;
        OddEvenSeparator OddEven = new OddEvenSeparator();
        number = 0;
        OddEven.addNumber(number);
        number = 2;
        OddEven.addNumber(number);
        number = 3;
        OddEven.addNumber(number);
        number = 10;
        OddEven.addNumber(number);
        number = 7;
        OddEven.addNumber(number);
        OddEven.odd();
        OddEven.even();

        //TIP 5
        System.out.println("\n\tTable..");
        int rows = 2;
        int columns = 2;
        Table badTable = new Table(rows, columns);
        badTable.setValue(0,0,11);
        badTable.setValue(0,1,12);
        badTable.setValue(1,0,21);
        badTable.setValue(1,1,22);
        badTable.rows();
        badTable.cols();
        badTable.toString();
        badTable.getValue(0, 0);
        System.out.println(badTable.average());

    }
}
package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// 1
        System.out.println("1. Counting click on button time's:\n");
        Button newButton = new Button();
        int n = 5;
        for (int i = 0; i < n; i++) newButton.click();

        /// 2
        System.out.print("\n2. Balance:\n");
        Balance newBalance = new Balance();
        newBalance.addLeft(15);
        newBalance.addRight(15);
        newBalance.result();
        newBalance.addRight(15);
        newBalance.result();
        newBalance.addLeft(30);
        newBalance.result();

        /// 3
        System.out.println("3. Ding-Dong\n");
        int dindonging = 10;
        Bell newBell = new Bell();
        for (int i=0; i<dindonging; i++) {
            newBell.sound();
        }

        /// 4
        System.out.println("4. ");
    }
}
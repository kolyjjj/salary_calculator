package koly.li;

import java.util.Scanner;

public class KengDieApp {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Kengdie kengdie = new Kengdie(new SalaryCalculator());
        while(true){
            System.out.println("Hi,Welcome to KengDie App, type -1 to quit the app!\nplease input your working days:");
            int days= in.nextInt();
            if (quit(days)) break;
            if (handleWrongInput(days)) continue;
            System.out.println(kengdie.calculate(days));
        }
        in.close();
    }

    private static boolean handleWrongInput(int days) {
        if(days < 0){
            System.out.println("Your working days must be larger than 0!");
            return true;
        }
        return false;
    }

    private static boolean quit(int days) {
        if (days == -1){
            System.out.println("Thanks for using our App! See you next time!");
            return true;
        }
        return false;
    }
}

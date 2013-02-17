package koly.li;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KengDieApp {

    private final List<CommandHandler> continueCommands = new ArrayList<CommandHandler>();
    private final List<CommandHandler> quitCommands = new ArrayList<CommandHandler>();
    private Kengdie kengdie;
    private int days;

    public KengDieApp(Kengdie kengdie) {
        this.kengdie = kengdie;
    }

    public void run(){
        Scanner in = new Scanner(System.in);
        initCommands();
        doMainLoop(in);
        in.close();
    }

    private void initCommands() {
        quitCommands.add(new QuitCommand());
        continueCommands.add(new WrongInputCommand());
    }

    private void doMainLoop(Scanner in) {
        while(true){
            printWelcomeMessage();
            handleNonIntInput(in);
            days = in.nextInt();
            if (handleQuitCommands())break;
            if (handleContinueCommands()) continue;
            printSalaryInfo();
        }
    }

    private void handleNonIntInput(Scanner in) {
        while (!in.hasNextInt()){
            System.out.println("please input numbers only!");
            in.nextLine();
        }
    }

    private void printSalaryInfo() {
        System.out.println(kengdie.calculate(days));
    }

    private void printWelcomeMessage() {
        System.out.println("Hi,Welcome to KengDie App, type -1 to quit the app!\nplease input your working days:");
    }

    private boolean handleQuitCommands() {
        for (CommandHandler c : quitCommands){
            if (c.handle(days)){
                return true;
            }
        }
        return false;
    }

    private boolean handleContinueCommands() {
        for (CommandHandler c : continueCommands){
            if(c.handle(days)){
                return true;
            }
        }
        return false;
    }

}

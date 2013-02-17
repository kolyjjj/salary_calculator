package koly.li;

public class QuitCommand implements CommandHandler {
    public boolean handle(int days) {
        if (days == -1){
            System.out.println("Thanks for using our App! See you next time!");
            return true;
        }
        return false;
    }
}

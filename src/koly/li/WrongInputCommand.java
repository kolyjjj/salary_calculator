package koly.li;

public class WrongInputCommand implements CommandHandler {
    public boolean handle(int days) {
        if(days < 0){
            System.out.println("Your working days must be larger than 0!");
            return true;
        }
        return false;
    }
}

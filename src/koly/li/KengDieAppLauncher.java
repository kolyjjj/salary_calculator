package koly.li;

public class KengDieAppLauncher {
    public static void main(String[] args){
        new KengDieApp(new Kengdie(new SalaryCalculator())).run();
    }
}

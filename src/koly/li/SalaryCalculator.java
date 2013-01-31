package koly.li;

public class SalaryCalculator {
    public double acquireSalary(int days, double moneyPerDay) {
        return moneyPerDay * days;
    }

    public double acquireBonus(double salary, double rate) {
        return salary * rate;
    }
}

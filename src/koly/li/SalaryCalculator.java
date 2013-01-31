package koly.li;

public class SalaryCalculator {
    public double acquireSalary(int days) {
        return 200 * days;
    }

    public double acquireBonus(double salary) {
        return salary * 0.1;
    }
}

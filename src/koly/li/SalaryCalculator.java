package koly.li;

public class SalaryCalculator {
    public double acquireSalary(int days, double moneyPerDay) {
        return moneyPerDay * days;
    }

    public double acquireBonus(double salary, double rate) {
        return salary * rate;
    }

    public double acquireBonusTax(double bonus, double bonusTaxRate) {
        return bonus * bonusTaxRate;
    }

    public double acquirePersonalTax(double salary, double personalTaxRate) {
        return salary < 3500.? 0. : (salary - 3500.) * personalTaxRate;
    }
}

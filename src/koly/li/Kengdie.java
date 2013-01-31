package koly.li;

public class Kengdie {

    private final SalaryCalculator calculator;

    public Kengdie(SalaryCalculator calculator) {
        this.calculator = calculator;
    }

    public String calculate(int days) {
        double salary = calculator.acquireSalary(days, 200.);
        double finalBonus = calculateFinalBonus(calculator.acquireSalary(days, 200.));
        return  "salary:" + salary + "\n" +
                "bonus:" + finalBonus + "\n" +
                "income:" + calculateIncome(salary, finalBonus) + "\n";
    }

    private double calculateIncome(double salary, double finalBonus) {
        return salary + finalBonus + calculator.acquirePersonalTax(salary, 0.1, 3500);
    }

    private double calculateFinalBonus(double salary){
        double bonus = calculator.acquireBonus(salary, 0.1);
        return bonus - calculator.acquireBonusTax(bonus, 0.05);
    }
}

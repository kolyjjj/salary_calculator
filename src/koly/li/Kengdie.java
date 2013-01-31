package koly.li;

public class Kengdie {

    private final SalaryCalculator calculator;
    private double salary;

    public Kengdie(SalaryCalculator calculator) {
        this.calculator = calculator;
    }

    public String calculate(int days) {
        salary = calculator.acquireSalary(days, 200.);
        double finalSalary = calculateFinalSalary();
        double finalBonus = calculateFinalBonus();

        return  "salary:" + finalSalary + "\n" +
                "bonus:" + finalBonus + "\n" +
                "income:" + calculateIncome(finalSalary, finalBonus) + "\n";
    }

    private double calculateFinalSalary() {
        return salary - calculator.acquirePersonalTax(salary, 0.1, 3500.);
    }

    private double calculateIncome(double salary, double bonus) {
        return salary + bonus;
    }

    private double calculateFinalBonus(){
        double bonus = calculator.acquireBonus(salary, 0.1);
        return bonus - calculator.acquireBonusTax(bonus, 0.05);
    }
}

package koly.li;

public class Kengdie {

    private final SalaryCalculator calculator;

    public Kengdie(SalaryCalculator calculator) {
        this.calculator = calculator;
    }

    public String calculate(int days) {
        String result = "";
        //calculateSalary
        double salary = calculator.acquireSalary(days, 200.);
        result += "salary:" + salary + "\n";

        //calculateBonus
        double finalBonus = calculateFinalBonus(salary);
        result += "bonus:" + finalBonus + "\n";

        //calculateIncome
        double income = salary + finalBonus + calculator.acquirePersonalTax(salary, 0.1, 3500);
        result += "income:" + income + "\n";
        return result;
    }

    private double calculateFinalBonus(double salary){
        double bonus = calculator.acquireBonus(salary, 0.1);
        double finalBonus = bonus - calculator.acquireBonusTax(bonus, 0.05);
        return finalBonus;
    }
}

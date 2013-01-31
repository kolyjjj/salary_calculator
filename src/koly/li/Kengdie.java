package koly.li;

public class Kengdie {
    public String calculate(int days) {
        String result = "";
        SalaryCalculator calculator = new SalaryCalculator();
        //calculateSalary
        double salary = calculator.acquireSalary(days, 200.);
        result += "salary:" + salary + "\n";

        //calculateBonus
        double bonus = calculator.acquireBonus(salary, 0.1);
        double finalBonus = bonus - calculator.acquireBonusTax(bonus, 0.05);
        result += "bonus:" + finalBonus + "\n";

        //calculateIncome
        double income = salary + bonus + calculator.acquirePersonalTax(salary, 0.1, 3500) -
                calculator.acquireBonusTax(bonus,0.05);
        result += "income:" + income + "\n";
        return result;
    }
}

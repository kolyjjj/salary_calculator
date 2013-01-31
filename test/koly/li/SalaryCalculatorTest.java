package koly.li;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SalaryCalculatorTest {

    private SalaryCalculator salaryCalculator;

    @Before
    public void setUp() throws Exception {
        salaryCalculator = new SalaryCalculator();
    }

    @Test
    public void should_get_one_day_salary() throws Exception {
        int oneDay = 1;
        assertThat(salaryCalculator.acquireSalary(oneDay, 200.), is(200.));
    }

    @Test
    public void should_get_more_than_one_day_salary() throws Exception {
        int threeDays = 3;
        assertThat(salaryCalculator.acquireSalary(threeDays, 200.), is(600.));
    }

    @Test
    public void should_get_bonus() throws Exception {
        double bonusRate = 0.1;
        assertThat(salaryCalculator.acquireBonus(200., bonusRate), is(20.));
    }

    @Test
    public void should_get_the_bonus_tax() throws Exception {
        double bonusTaxRate = 0.05;
        assertThat(salaryCalculator.acquireBonusTax(200., bonusTaxRate), is(10.));
    }

    @Test
    public void should_get_zero_personal_tax_when_salary_is_below_the_limit() throws Exception {
        double personalTaxRate = 0.1;
        assertThat(salaryCalculator.acquirePersonalTax(2000., personalTaxRate, 3500.), is(0.));
    }

    @Test
    public void should_get_personal_tax_when_salary_is_beyond_the_limit() throws Exception {
        double personalTaxRate = 0.1;
        assertThat(salaryCalculator.acquirePersonalTax(4500., personalTaxRate, 3500.), is(100.));
    }
}

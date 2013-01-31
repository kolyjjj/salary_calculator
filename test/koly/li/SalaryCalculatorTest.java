package koly.li;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SalaryCalculatorTest {
    @Test
    public void should_get_one_day_salary() throws Exception {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        assertThat(salaryCalculator.run(1), is(200.));
    }

    @Test
    public void should_get_more_than_one_day_salary() throws Exception {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        assertThat(salaryCalculator.run(3), is(600.));
    }

}

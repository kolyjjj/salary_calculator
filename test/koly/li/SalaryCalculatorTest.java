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
        assertThat(salaryCalculator.acquireSalary(1), is(200.));
    }

    @Test
    public void should_get_more_than_one_day_salary() throws Exception {
        assertThat(salaryCalculator.acquireSalary(3), is(600.));
    }

    @Test
    public void should_get_bonus() throws Exception {
        assertThat(salaryCalculator.acquireBonus(200.), is(20.));
    }
}

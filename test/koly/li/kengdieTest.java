package koly.li;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class KengdieTest {
    @Test
    public void should_return_salary_bonus_and_total_income() throws Exception {
        Kengdie kengdie = new Kengdie(new SalaryCalculator());
        assertThat(kengdie.calculate(10), is("salary:2000.0\nbonus:190.0\nincome:2190.0\n"));
    }
}

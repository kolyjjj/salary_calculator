package koly.li;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class KengdieTest {

    private Kengdie kengdie;

    @Before
    public void setUp() throws Exception {
        kengdie = new Kengdie(new SalaryCalculator());
    }

    @Test
    public void should_return_salary_bonus_and_total_income() throws Exception {
        assertThat(kengdie.calculate(10), is("salary:2000.0\nbonus:190.0\nincome:2190.0\n"));
    }

    @Test
    public void should_return_salary_bonus_and_total_income_when_salary_beyond_limit() throws Exception {
        assertThat(kengdie.calculate(30), is("salary:5750.0\nbonus:570.0\nincome:6320.0\n"));
    }
}

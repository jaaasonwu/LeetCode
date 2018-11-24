package problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    @Test
    public void calculate() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate(" 2-1 + 2 "));
    }

    @Test
    public void calculate2() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void calculate3() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate(" 1 + 1 "));
    }

    @Test
    public void calculate4() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate(" 1 - (5) "));
    }
}
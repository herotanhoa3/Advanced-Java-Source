package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Chapter1Part1.Operator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author hv
 */
public class OperatorJUnitTest {
    Operator ope = new Operator();
    public OperatorJUnitTest() {
       
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /*
    / Unit Test for Operator
    / Input firstNumber, secondNumber
    / Output Plus, Minus, Divide, Multi 
    */
    @Test
    public void OperatorTest_01() {
        ope.setFirstNumber(1);
        ope.setSecondNumber(2);
        double ex = 3;
        double ac = ope.calculatePlus();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_02() {
        ope.setFirstNumber(3);
        ope.setSecondNumber(4);
        double ex = 7;
        double ac = ope.calculatePlus();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_03() {
        ope.setFirstNumber(-9);
        ope.setSecondNumber(2);
        double ex = -11;
        double ac = ope.calculateMinus();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_04() {
        ope.setFirstNumber(0);
        ope.setSecondNumber(3);
        double ex = 3;
        double ac = ope.calculatePlus();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_05() {
        ope.setFirstNumber(-9);
        ope.setSecondNumber(2);
        double ex = -4.5;
        double ac = ope.calculateDivide();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_06() {
        ope.setFirstNumber(7);
        ope.setSecondNumber(-3);
        double ex = -2.333;
        double ac = ope.calculateDivide();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_07() {
        ope.setFirstNumber(-6);
        ope.setSecondNumber(-2);
        double ex = 12;
        double ac = ope.calculateMulti();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_08() {
        ope.setFirstNumber(2);
        ope.setSecondNumber(-3);
        double ex = -6;
        double ac = ope.calculateMulti();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_09() {
        ope.setFirstNumber(0);
        ope.setSecondNumber(-2);
        double ex = 0;
        double ac = ope.calculateMulti();
        assertEquals(ex, ac, 0.01);
    }
    @Test
    public void OperatorTest_10() {
        ope.setFirstNumber(3);
        ope.setSecondNumber(-3);
        double ex = -9;
        double ac = ope.calculateMulti();
        assertEquals(ex, ac, 0.01);
    }
}

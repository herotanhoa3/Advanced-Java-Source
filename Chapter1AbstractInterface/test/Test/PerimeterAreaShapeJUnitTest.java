/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import PerimeterAreaShape.Circle;
import PerimeterAreaShape.Square;
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
public class PerimeterAreaShapeJUnitTest {

    Circle circle;
    Square square;

    public PerimeterAreaShapeJUnitTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PerimeterCircleTest_01() {
        circle = new Circle();
        circle.r = 3;
        double ex = 18.84;
        double ac = circle.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterCircleTest_02() {
        circle = new Circle();
        circle.r = 7;
        double ex = 43.98;
        double ac = circle.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterCircleTest_03() {
        circle = new Circle();
        circle.r = -3;
        double ex = 18;
        double ac = circle.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterCircleTest_04() {
        circle = new Circle();
        circle.r = 9;
        double ex = 56.54;
        double ac = circle.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterCircleTest_05() {
        circle = new Circle();
        circle.r = 13;
        double ex = 81.68;
        double ac = circle.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterSquareTest_06() {
        square = new Square();
        square.width = 13;
        double ex = 52;
        double ac = square.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterSquareTest_07() {
        square = new Square();
        square.width = -3;
        double ex = 12;
        double ac = square.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterSquareTest_08() {
        square = new Square();
        square.width = 4;
        double ex = 16;
        double ac = square.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterSquareTest_09() {
        square = new Square();
        square.width = 2;
        double ex = 8;
        double ac = square.perimeter();
        assertEquals(ex, ac, 0.01);
    }

    @Test
    public void PerimeterSquareTest_10() {
        square = new Square();
        square.width = 8;
        double ex = 32;
        double ac = square.perimeter();
        assertEquals(ex, ac, 0.01);
    }

}

package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ManageVehicle.Car;
import ManageVehicle.Ship;
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
public class ManageVehicleJUnitTest {

    Car car;
    Ship ship;

    public ManageVehicleJUnitTest() {
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
    public void ManageVehicleTest_01() {
        car = new Car();
        car.distance = 5;
        car.time = 2;
        double ex = 2.5;
        double ac = car.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_02() {
        car = new Car();
        car.distance = 0;
        car.time = 2;
        double ex = 0;
        double ac = car.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_03() {
        car = new Car();
        car.distance = 10;
        car.time = 12;
        double ex = 0.83;
        double ac = car.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_04() {
        car = new Car();
        car.distance = -12;
        car.time = 2;
        double ex = 6;
        double ac = car.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_05() {
        car = new Car();
        car.distance = 12;
        car.time = -12;
        double ex = 1;
        double ac = car.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_06() {
        ship = new Ship();
        ship.distance = 0;
        ship.time = 2;
        double ex = 1;
        double ac = ship.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_07() {
        ship = new Ship();
        ship.distance = 11;
        ship.time = 12;
        double ex = 1;
        double ac = ship.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_08() {
        ship = new Ship();
        ship.distance = -9;
        ship.time = -2;
        double ex = 1;
        double ac = ship.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_09() {
        ship = new Ship();
        ship.distance = 13;
        ship.time = 2;
        double ex = 6.5;
        double ac = ship.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
    @Test
    public void ManageVehicleTest_10() {
        ship = new Ship();
        ship.distance = 8;
        ship.time = 3;
        double ex = 2.5;
        double ac = ship.getSpeed();
        assertEquals(ex, ac, 0.1);
    }
}

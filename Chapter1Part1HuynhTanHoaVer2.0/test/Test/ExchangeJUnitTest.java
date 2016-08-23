package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ManageExchange.GoldExchange;
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
public class ExchangeJUnitTest {
    GoldExchange gold = new GoldExchange();
    
    
    public ExchangeJUnitTest() {
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
     public void ExchangeJUnitTest_01() {
         gold.setType(1);
         gold.setNumberExchange(1);
         double ex = 2597800;
         double ac = gold.calculatePrice();
         assertEquals( ex, ac, 100000);
     }
}

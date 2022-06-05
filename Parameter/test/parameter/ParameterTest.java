/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ParameterTest {
    
    public ParameterTest() {
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

    /**
     * Test of display1 method, of class Parameter.
     */
    @Test
    public void testDisplay1() {
        System.out.println("display1");
        Parameter instance = new Parameter();
        instance.display1();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display2 method, of class Parameter.
     */
    @Test
    public void testDisplay2() {
        System.out.println("display2");
        int n = 0;
        Parameter instance = new Parameter();
        instance.display2(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Parameter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Parameter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

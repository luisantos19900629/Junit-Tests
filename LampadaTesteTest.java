/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luis Santos
 */
public class LampadaTesteTest {
    
    LampadaTeste L;
    
    public LampadaTesteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        L = new LampadaTeste();
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of utilizarLampada method, of class LampadaTeste.
     */
    @Test
    public void testUtilizarLampada() {
assertTrue(L.utilizarLampada(1));
    }
    
}

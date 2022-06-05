
package unittest;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ClaculatorTest {
    
    @Test
    public void testAdd() {

        Claculator c = new Claculator();
        double expected = 5;
        double actual = c.add(2, 3);
        assertEquals(5, actual, 0.00001);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

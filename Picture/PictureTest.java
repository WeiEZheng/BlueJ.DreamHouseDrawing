

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PictureTest.
 *
 * @author  
 * @version 
 */
public class PictureTest
{
    
    /**
     * Default constructor for test class PictureTest
     */
    public PictureTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void DrawTest()
    {
        Picture picture1 = new Picture();
        picture1.draw();
        
    }
}


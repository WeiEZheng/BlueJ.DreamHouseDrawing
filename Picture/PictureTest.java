

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PictureTest.
 *
 * @author  Wei Zheng
 * @version 2/22/2022
 */
public class PictureTest
{
    private Circle sun;
    private Circle doorwindow;
    private Square door;
    private Square window;
    private Square window2;
    private Square wall;
    private Square wall2;
    private Triangle roof;
    private Triangle roof2;
    
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
        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(20);
        sun.moveVertical(-10);
        sun.changeSize(60);
        sun.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.changeColor("black");
        roof.makeVisible();
        
        wall2 = new Square();
        wall2.moveVertical(60);
        wall2.moveHorizontal(100);
        wall2.changeSize(120);
        wall2.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveVertical(100);
        window2.moveHorizontal(70);
        window2.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(50, 180);
        roof2.moveHorizontal(170);
        roof2.moveVertical(60);
        roof2.changeColor("black");
        roof2.makeVisible();
        
        door = new Square();
        door.moveVertical(130);
        door.moveHorizontal(130);
        door.changeColor("blue");
        door.changeSize(50);
        door.makeVisible();
        
        doorwindow = new Circle();
        doorwindow.moveVertical(80);
        doorwindow.moveHorizontal(180);
        doorwindow.changeColor("white");
        doorwindow.makeVisible();
    }
}



/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
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
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
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

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}

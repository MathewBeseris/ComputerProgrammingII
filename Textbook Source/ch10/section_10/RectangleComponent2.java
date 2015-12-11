import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.util.*;

/**
   This component displays a rectangle that can be moved. 
*/
public class RectangleComponent2 extends JComponent
{
   private static final int BOX_X = 100;
   private static final int BOX_Y = 100;
   private static final int BOX_WIDTH = 20;
   private static final int BOX_HEIGHT = 30;

   private Rectangle box;

   private ArrayList<Rectangle> boxes;

   
   public void createRectangle(int mousex, int mousey){
      
      boxes.add(new Rectangle(mousex, mousey ,BOX_WIDTH, BOX_HEIGHT));
      repaint();
   }

   public RectangleComponent2()
   {  
       boxes = new ArrayList<Rectangle>();
           
   }

   public void paintComponent(Graphics g)
   {  
      Graphics2D g2 = (Graphics2D) g;
      
      if(boxes.size()>0){
         for(int i = 0; i < boxes.size(); i++){
            g2.draw(boxes.get(i));
         }
      }
   }

   /**
      Moves the rectangle to the given location.
      @param x the x-position of the new location
      @param y the y-position of the new location
   */
   public void moveRectangleTo(int x, int y)
   {
      box.setLocation(x, y);
      repaint();      
   }
}

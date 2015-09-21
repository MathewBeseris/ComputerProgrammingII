import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;
import javax.swing.JFrame;


/*P2.1
public class FourRectanglePrinter{
  public static void main(String[] args){
    Rectangle box = new Rectangle(20,20,15,25);
    System.out.println(box);
    box.translate(15,0);
    System.out.println(box);
    box.translate(0,25);
    System.out.println(box);
    box.translate(-15,0);
    System.out.println(box);
  }
}*/


/*P2.2
public class FourRectanglePrinter{
  public static void main(String[] args){
    Rectangle box = new Rectangle(100,100,50,50);
    box.grow(2,2);
    box.translate(-50,-50);
    System.out.println(box);
  }
}*/


/*P2.3
public class FourRectanglePrinter{
  public static void main(String[] args){
    Rectangle box1 = new Rectangle(25,25,10,30);
    Rectangle box2 = new Rectangle(15,15,25,10);
    Rectangle intersection = box1.intersection(box2);
    System.out.println(intersection);
    //The boxes intersect if the width and height are not negative values
  }
}*/



/*P2.8
public class FourRectanglePrinter{
  public static void main(String[] args){
    Line2D.Double line1 = new Line2D.Double(100,100,200,200);
    Point2D.Double p1 = new Point2D.Double(100,200);
    Point2D.Double p2 = new Point2D.Double(150,150);
    Point2D.Double p3 = new Point2D.Double(250,50);
    
    System.out.println(line1.ptSegDist(p1));
    System.out.println(line1.ptSegDist(p2));
    System.out.println(line1.ptSegDist(p3));
  }
}*/


    
    
 


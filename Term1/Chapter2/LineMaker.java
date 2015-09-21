import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;


public class LineMaker extends JComponent{
  public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    
    Line2D.Double line1 = new Line2D.Double(100,100,200,200);
    Point2D.Double p1 = new Point2D.Double(100,200);
    Point2D.Double p2 = new Point2D.Double(150,150);
    Point2D.Double p3 = new Point2D.Double(250,50);
    
    g2.draw(line1);
    
    Ellipse2D.Double dot1 = new Ellipse2D.Double(p1.getX(),200,5,5);
    Ellipse2D.Double dot2 = new Ellipse2D.Double(p2.getX(),159,5,5);
    Ellipse2D.Double dot3 = new Ellipse2D.Double(p3.getX(),250,5,5);
    g2.draw(dot1);
    g2.draw(dot2);
    g2.draw(dot3);
    
    g2.drawString(Double.toString((line1.ptSegDist(p1))),100,200);
    g2.drawString(Double.toString((line1.ptSegDist(p2))),150,150);
    g2.drawString(Double.toString((line1.ptSegDist(p3))),250,50);
  }
}
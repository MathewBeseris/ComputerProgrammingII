
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;




public class ColorNameComponent extends JComponent{
  public void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    
    
    g2.drawString("Color",5,10);
    g2.setColor(Color.BLUE);
    g2.drawString("Color",5,20);
    g2.setColor(Color.CYAN);
    g2.drawString("Color",5,30);
    g2.setColor(Color.GRAY);
    g2.drawString("Color",5,40);
    g2.setColor(Color.DARK_GRAY);
    g2.drawString("Color",5,50);
    g2.setColor(Color.LIGHT_GRAY);
    g2.drawString("Color",5,60);
    g2.setColor(Color.GREEN);
    g2.drawString("Color",5,70);
    g2.setColor(Color.MAGENTA);
    g2.drawString("Color",5,80);
    g2.setColor(Color.ORANGE);
    g2.drawString("Color",5,90);
    g2.setColor(Color.PINK);
    g2.drawString("Color",5,100);
    g2.setColor(Color.RED);
    g2.drawString("Color",5,110);
    g2.setColor(Color.YELLOW);
    g2.drawString("Color",5,120);
    
  }
}
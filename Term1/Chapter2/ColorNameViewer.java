import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;


/*P2.10*/
public class ColorNameViewer{
  public static void main(String[] args){
    
    JFrame frame = new JFrame();

    frame.setSize(450, 500);
    frame.setTitle("Points");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    ColorNameComponent component = new ColorNameComponent();
    frame.add(component);
    
    frame.setVisible(true);
    
    
  }
}